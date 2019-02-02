package com.nju.mj.journey.controller;

import com.nju.mj.journey.entity.Participant;
import com.nju.mj.journey.entity.common.JSONResult;
import com.nju.mj.journey.service.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ParticipantController {
    @Autowired
    private ParticipantService participantService;

    @RequestMapping(value = "/participant", method = RequestMethod.POST)
    public JSONResult addJourney(@RequestBody Participant participant) {
        participantService.addParticipant(participant);
        return JSONResult.ok();
    }

    @RequestMapping(value = "/participant", method = RequestMethod.GET)
    public JSONResult findByCondition(String userId, String journeyId) {
        List<Participant> participants =participantService.findByCondition(userId,journeyId);
        return JSONResult.ok(participants);
    }
}
