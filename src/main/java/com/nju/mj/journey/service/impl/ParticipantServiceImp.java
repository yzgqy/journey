package com.nju.mj.journey.service.impl;

import com.nju.mj.journey.dao.ParticipantMapper;
import com.nju.mj.journey.entity.Participant;
import com.nju.mj.journey.service.ParticipantService;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
@Transactional
public class ParticipantServiceImp implements ParticipantService {
    @Autowired
    private ParticipantMapper participantMapper;
    @Autowired
    private Sid sid;
    @Override
    public void addParticipant(Participant participant) {
        String participantId = sid.nextShort();
        participant.setId(participantId);
        participant.setIsarrived(0);
        participant.setIshome(0);
        participant.setIsconfirmed(0);
        participant.setDesc("参与者");
        participant.setCreatedat(new Date());
        participant.setUpdatedat(new Date());
        participantMapper.insertSelective(participant);
    }
}
