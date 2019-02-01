package com.nju.mj.journey.entity.bean;

import com.nju.mj.journey.entity.Journey;
import com.nju.mj.journey.entity.Participant;
import com.nju.mj.journey.entity.Scheduling;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Setter
@Getter
@ToString
public class JourneyBean {
    private Journey journey;
    private List<Scheduling> schedulingList;
    private List<Participant> participantList;
 }
