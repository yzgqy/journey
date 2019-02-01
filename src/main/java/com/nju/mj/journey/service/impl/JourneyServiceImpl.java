package com.nju.mj.journey.service.impl;

import com.nju.mj.journey.dao.JourneyMapper;
import com.nju.mj.journey.dao.JourneyUserMapper;
import com.nju.mj.journey.dao.ParticipantMapper;
import com.nju.mj.journey.dao.SchedulingMapper;
import com.nju.mj.journey.entity.*;
import com.nju.mj.journey.entity.bean.JourneyBean;
import com.nju.mj.journey.service.JourneyService;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class JourneyServiceImpl implements JourneyService {
    @Autowired
    private Sid sid;
    @Autowired
    private JourneyMapper journeyMapper;
    @Autowired
    private SchedulingMapper schedulingMapper;
    @Autowired
    private ParticipantMapper participantMapper;
    @Autowired
    private JourneyUserMapper journeyUserMapper;

    @Override
    public void addJourney(Journey journey, List<Scheduling> schedulings) {
        String id = sid.nextShort();
        journey.setId(id);
        journey.setFlag(1);
        journey.setCreatedat(new Date());
        journey.setUpdatedat(new Date());
        journeyMapper.insertSelective(journey);

        for (Scheduling scheduling : schedulings) {
            String schedulingId = sid.nextShort();
            scheduling.setId(schedulingId);
            scheduling.setJourneyid(id);
            scheduling.setCreatedat(new Date());
            scheduling.setUpdatedat(new Date());
            scheduling.setState(0);
            scheduling.setIsfinished(0);
            schedulingMapper.insertSelective(scheduling);
        }
        Participant participant =new Participant();
        String participantId = sid.nextShort();
        participant.setId(participantId);
        participant.setIsarrived(0);
        participant.setIshome(0);
        participant.setJourneyid(id);
        participant.setUserid(journey.getSponsorid());
        participant.setIsconfirmed(1);
        participant.setIsinvited(2);
        participant.setDesc("发起人");
        participant.setCreatedat(new Date());
        participant.setUpdatedat(new Date());
        participantMapper.insertSelective(participant);
    }

    @Override
    public void updateJourney(Journey journey, List<Scheduling> schedulings) {
        journey.setUpdatedat(new Date());
        journeyMapper.updateByPrimaryKeySelective(journey);

        SchedulingExample schedulingExample = new SchedulingExample();
        SchedulingExample.Criteria schedulingCriteria = schedulingExample.createCriteria();
        schedulingCriteria.andJourneyidEqualTo(journey.getId());
        schedulingMapper.deleteByExample(schedulingExample);

        for (Scheduling scheduling : schedulings) {
            String schedulingId = sid.nextShort();
            scheduling.setId(schedulingId);
            scheduling.setJourneyid(journey.getId());
            scheduling.setCreatedat(new Date());
            scheduling.setUpdatedat(new Date());
            schedulingMapper.insertSelective(scheduling);
        }
    }

    @Override
    public JourneyBean findByJourneyId(String journeyId) {
        Journey journey = journeyMapper.selectByPrimaryKey(journeyId);
        if (journey.getFlag() == 0)
            return null;

        String sponsorId = journey.getSponsorid();
        JourneyUser sponsorUser = journeyUserMapper.selectByPrimaryKey(sponsorId);
        journey.setSponsorid(sponsorUser.getNickname());

        SchedulingExample schedulingExample = new SchedulingExample();
        SchedulingExample.Criteria schedulingCriteria = schedulingExample.createCriteria();
        schedulingCriteria.andJourneyidEqualTo(journey.getId());
        List<Scheduling> schedulingList = schedulingMapper.selectByExample(schedulingExample);

        ParticipantExample participantExample = new ParticipantExample();
        ParticipantExample.Criteria participantCriteria = participantExample.createCriteria();
        participantCriteria.andJourneyidEqualTo(journey.getId());
        List<Participant> participantList = participantMapper.selectByExample(participantExample);

        for(Participant participant:participantList){
            String userId = participant.getUserid();
            JourneyUser participantUser = journeyUserMapper.selectByPrimaryKey(userId);
            participant.setUserid(participantUser.getNickname());
        }

        JourneyBean journeyBean = new JourneyBean();
        journeyBean.setJourney(journey);
        journeyBean.setSchedulingList(schedulingList);
        journeyBean.setParticipantList(participantList);
        return  journeyBean;
    }

    @Override
    public List<Journey> findByCondition(String userId, int flag) {
//        flag:0-正在参与的；1-结束了的；2-所有的

        //发起人省份：
//        JourneyExample journeyExample = new JourneyExample();
//        JourneyExample.Criteria journeyCriteria = journeyExample.createCriteria();
//        if(flag == 0){
//            journeyCriteria.andFlagEqualTo(1).andIsfindEqualTo(0).andIspublicEqualTo(1).andSponsoridEqualTo(userId);
//        }else if(flag == 1){
//            journeyCriteria.andFlagEqualTo(1).andIsfindEqualTo(1).andIspublicEqualTo(1).andSponsoridEqualTo(userId);
//        }else if(flag == 2){
//            journeyCriteria.andFlagEqualTo(1).andIspublicEqualTo(1).andSponsoridEqualTo(userId);
//        }
//        journeyExample.setOrderByClause("createdAt");
//        List<Journey> journeyList = journeyMapper.selectByExample(journeyExample);

        //参与者省份：
        List<Journey> journeyList = new ArrayList<>();
        ParticipantExample participantExample = new ParticipantExample();
        ParticipantExample.Criteria participantCriteria = participantExample.createCriteria();
        participantCriteria.andUseridEqualTo(userId);
        participantExample.setOrderByClause("createdAt");
        List<Participant> participantList = participantMapper.selectByExample(participantExample);
        for(Participant participant:participantList){
            Journey journey = journeyMapper.selectByPrimaryKey(participant.getJourneyid());
            if(flag == 0 && journey.getFlag() == 1 && journey.getIsfind() == 0 &&journey.getIspublic() == 1){
                journeyList.add(journey);
            }else if(flag == 1 && journey.getFlag() == 1 && journey.getIsfind() == 1 &&journey.getIspublic() == 1){
                journeyList.add(journey);
            }else if(flag == 2 && journey.getFlag() == 1  &&journey.getIspublic() == 1){
                journeyList.add(journey);
            }
        }

        for(Journey journey:journeyList){
            String sponsorId = journey.getSponsorid();
            JourneyUser sponsorUser = journeyUserMapper.selectByPrimaryKey(sponsorId);
            journey.setSponsorid(sponsorUser.getNickname());
        }
        return journeyList;
    }

    @Override
    public List<Journey> findAllByCondition() {
        JourneyExample journeyExample = new JourneyExample();
        JourneyExample.Criteria journeyCriteria = journeyExample.createCriteria();
        journeyCriteria.andFlagEqualTo(1).andIsfindEqualTo(0).andIspublicEqualTo(1);
        journeyExample.setOrderByClause("createdAt");
        List<Journey> journeys = journeyMapper.selectByExample(journeyExample);
        for(Journey journey:journeys){
            String sponsorId = journey.getSponsorid();
            JourneyUser sponsorUser = journeyUserMapper.selectByPrimaryKey(sponsorId);
            journey.setSponsorid(sponsorUser.getNickname());
        }
        return journeys;
    }

    @Override
    public void confirmHome(String userId, String journeyId) {
        Participant participant = new Participant();
        participant.setUserid(userId);
        participant.setJourneyid(journeyId);
        participant.setIshome(1);
        ParticipantExample participantExample = new ParticipantExample();
        ParticipantExample.Criteria participantCriteria = participantExample.createCriteria();
        participantCriteria.andUseridEqualTo(userId).andJourneyidEqualTo(journeyId);
        participantMapper.updateByExampleSelective(participant,participantExample);

    }

    @Override
    public void confirmArrived(String userId, String journeyId) {
        Participant participant = new Participant();
        participant.setUserid(userId);
        participant.setJourneyid(journeyId);
        participant.setIsarrived(1);
        ParticipantExample participantExample = new ParticipantExample();
        ParticipantExample.Criteria participantCriteria = participantExample.createCriteria();
        participantCriteria.andUseridEqualTo(userId).andJourneyidEqualTo(journeyId);
        participantMapper.updateByExampleSelective(participant,participantExample);
    }

    @Override
    public void confirm(String userId, String journeyId) {
        Participant participant = new Participant();
        participant.setUserid(userId);
        participant.setJourneyid(journeyId);
        participant.setIsconfirmed(1);
        ParticipantExample participantExample = new ParticipantExample();
        ParticipantExample.Criteria participantCriteria = participantExample.createCriteria();
        participantCriteria.andUseridEqualTo(userId).andJourneyidEqualTo(journeyId);
        participantMapper.updateByExampleSelective(participant,participantExample);
    }

//    @Override
//    public void addParticipant(Participant participant) {
//        String participantId = sid.nextShort();
//        participant.setId(participantId);
//        participant.setIsarrived(0);
//        participant.setIshome(0);
//        participant.setIsconfirmed(0);
//        participant.setDesc("参与者");
//        participant.setCreatedat(new Date());
//        participant.setUpdatedat(new Date());
//        participantMapper.insertSelective(participant);
//    }
}
