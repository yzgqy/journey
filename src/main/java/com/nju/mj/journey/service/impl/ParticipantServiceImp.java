package com.nju.mj.journey.service.impl;

import com.nju.mj.journey.dao.ParticipantMapper;
import com.nju.mj.journey.entity.Participant;
import com.nju.mj.journey.entity.ParticipantExample;
import com.nju.mj.journey.service.ParticipantService;
import com.nju.mj.journey.utils.Myuuid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class ParticipantServiceImp implements ParticipantService {
    @Autowired
    private ParticipantMapper participantMapper;
//    @Autowired
//    private Sid sid;
    @Override
    public void addParticipant(Participant participant) {
        String participantId = Myuuid.getUUID();
        participant.setId(participantId);
        participant.setIsarrived(0);
        participant.setIshome(0);
        participant.setIsconfirmed(0);
        participant.setDesc("参与者");
        participant.setCreatedat(new Date());
        participant.setUpdatedat(new Date());
        participantMapper.insertSelective(participant);
    }

    @Override
    public List<Participant> findByCondition(String userId, String journeyId) {
        ParticipantExample participantExample = new ParticipantExample();
        ParticipantExample.Criteria criteria = participantExample.createCriteria();
        if(userId!=null)
            criteria.andUseridEqualTo(userId);
        if(journeyId!=null)
            criteria.andJourneyidEqualTo(journeyId);
        List<Participant> participants = participantMapper.selectByExampleWithBLOBs(participantExample);
        return participants;
    }

    @Override
    public void deleteById(String participant) {
        participantMapper.deleteByPrimaryKey(participant);

    }
}
