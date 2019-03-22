package com.nju.mj.journey.controller;

import com.nju.mj.journey.entity.JourneyUser;
import com.nju.mj.journey.entity.common.JSONResult;
import com.nju.mj.journey.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
//@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public JSONResult addUser(@RequestBody JourneyUser user){
        userService.addUser(user);
        return JSONResult.ok();
    }
    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    public JSONResult updatedUser(@RequestBody JourneyUser user){
        userService.updatedUser(user);
        return JSONResult.ok();
    }
    @RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
    public JSONResult findUserByUserId(@PathVariable  String userId){
        JourneyUser journeyUser = userService.findUserByUserId(userId);
        return JSONResult.ok(journeyUser);
    }
    @RequestMapping(value = "/user/openId/{openId}", method = RequestMethod.GET)
    public JSONResult findUserByopenId(@PathVariable  String openId){
        JourneyUser journeyUser = userService.findUserByOpenid(openId);
        return JSONResult.ok(journeyUser);
    }

    @RequestMapping(value = "/user/nickname/{nickname}", method = RequestMethod.GET)
    public JSONResult login(@PathVariable  String nickname){
        JourneyUser journeyUser = userService.login(nickname);
        return JSONResult.ok(journeyUser);
    }


}
