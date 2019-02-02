package com.nju.mj.journey.service;

import com.nju.mj.journey.entity.Participant;

import java.util.List;

public interface ParticipantService {
    public void addParticipant(Participant participant);
    public List<Participant> findByCondition(String userId,String journeyId);
    public void deleteById(String participant);
}
