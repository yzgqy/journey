package com.nju.mj.journey.controller;

import com.nju.mj.journey.entity.Journey;
import com.nju.mj.journey.entity.Scheduling;
import com.nju.mj.journey.entity.bean.JourneyBean;
import com.nju.mj.journey.entity.common.JSONResult;
import com.nju.mj.journey.service.JourneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class JourneyController {
    @Autowired
    private JourneyService journeyService;

    @RequestMapping(value = "/journey", method = RequestMethod.POST)
    public JSONResult addJourney(@RequestBody JourneyBean journeyBean) {
        Journey journey = journeyBean.getJourney();
        List<Scheduling> schedulings = journeyBean.getSchedulingList();
        journeyService.addJourney(journey, schedulings);
        return JSONResult.ok();
    }

    @RequestMapping(value = "/journey", method = RequestMethod.PUT)
    public JSONResult updateJourney(@RequestBody JourneyBean journeyBean) {
        Journey journey = journeyBean.getJourney();
        List<Scheduling> schedulings = journeyBean.getSchedulingList();
        journeyService.updateJourney(journey, schedulings);
        return JSONResult.ok();
    }

    @RequestMapping(value = "/journey/{journeyId}", method = RequestMethod.GET)
    public JSONResult findByJourneyId(@PathVariable String journeyId) {
        JourneyBean journeyBean = journeyService.findByJourneyId(journeyId);
        return JSONResult.ok(journeyBean);
    }

    @RequestMapping(value = "/journey/code/{code}", method = RequestMethod.GET)
    public JSONResult findByCode(@PathVariable String code) {
        List<Journey> journeyList = journeyService.findByCode(code);
        return JSONResult.ok(journeyList);
    }

    @RequestMapping(value = "/journey", method = RequestMethod.GET)
    public JSONResult findByCondition(String userId, Integer flag) {
        List<Journey> journeyList = new ArrayList<>();
        if (userId == null && flag == null)
            journeyList = journeyService.findAllByCondition();
        else
            journeyList = journeyService.findByCondition(userId, flag);
        return JSONResult.ok(journeyList);
    }

//    public JSONResult findAllByCondition() {
//        List<Journey> journeyList = journeyService.findAllByCondition();
//        return JSONResult.ok(journeyList);
//    }

    @RequestMapping(value = "/journey/home", method = RequestMethod.GET)
    public JSONResult confirmHome(String userId, String journeyId) {
        journeyService.confirmHome(userId, journeyId);
        return JSONResult.ok();
    }

    @RequestMapping(value = "/journey/arrived", method = RequestMethod.GET)
    public JSONResult confirmArrived(String userId, String journeyId) {
        journeyService.confirmArrived(userId, journeyId);
        return JSONResult.ok();
    }

    @RequestMapping(value = "/journey/confirm", method = RequestMethod.GET)
    public JSONResult confirm(String userId, String journeyId) {
        journeyService.confirm(userId, journeyId);
        return JSONResult.ok();
    }
}
