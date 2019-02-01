package com.nju.mj.journey.controller;

import com.nju.mj.journey.dao.JourneyUserMapper;
import com.nju.mj.journey.entity.JourneyUser;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;

@RestController
@CrossOrigin
@RequestMapping("/test")
public class TestController {
    @Autowired
    private JourneyUserMapper journeyUserMapper;
    @Autowired
    private Sid sid;

    @RequestMapping(value = "/addUser",method = RequestMethod.GET)
    public HashMap<String,Object> getTest() {
        HashMap<String,Object> result = new HashMap<String,Object>();
        String id = sid.nextShort();
        JourneyUser user = new JourneyUser();
        user.setCity("yz");
        user.setCreatedat(new Date());
        user.setNickname("gqy");
        user.setUpdatedat(new Date());
        user.setFlag(1);
        user.setId(id);
        user.setDesc("hehehhehehe");
        journeyUserMapper.insert(user);
        result.put("user",user);
        return result;
    }

}
