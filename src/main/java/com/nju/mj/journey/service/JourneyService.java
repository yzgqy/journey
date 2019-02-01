package com.nju.mj.journey.service;

import com.nju.mj.journey.entity.Journey;
import com.nju.mj.journey.entity.Participant;
import com.nju.mj.journey.entity.Scheduling;
import com.nju.mj.journey.entity.bean.JourneyBean;

import java.util.List;

public interface JourneyService {
    public void addJourney(Journey journey, List<Scheduling> schedulings);
    public void updateJourney(Journey journey, List<Scheduling> schedulings);
    public JourneyBean findByJourneyId(String journeyId);
    public List<Journey> findByCondition(String userId,int flag);
    public List<Journey> findAllByCondition();
    public void confirmHome(String userId,String journeyId);
    public void confirmArrived(String userId,String journeyId);
    public void confirm(String userId,String journeyId);
//    public void addParticipant(Participant participant);
}
