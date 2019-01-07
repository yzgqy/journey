package com.nju.mj.journey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@CrossOrigin
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/getTest")
    public HashMap<String,Object> getTest() {
        HashMap<String,Object> result = new HashMap<String,Object>();
        result.put("name","test1");
        result.put("desc","测试controller");
        return result;
    }

}
