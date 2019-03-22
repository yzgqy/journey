package com.nju.mj.journey.controller;

import java.util.HashMap;
import java.util.Map;

import com.nju.mj.journey.entity.JourneyUser;
import com.nju.mj.journey.entity.bean.WXSessionModel;
import com.nju.mj.journey.entity.common.JSONResult;
import com.nju.mj.journey.service.UserService;
import com.nju.mj.journey.utils.HttpClientUtil;
import com.nju.mj.journey.utils.JsonUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WechatController {

    //    @Autowired
//    private RedisOperator redis;
    @Autowired
    private UserService userService;


    @PostMapping("/wxLogin")
    public JSONResult wxLogin(String code) {

        System.out.println("wxlogin - code: " + code);

//		https://api.weixin.qq.com/sns/jscode2session?
//				appid=APPID&
//				secret=SECRET&
//				js_code=JSCODE&
//				grant_type=authorization_code

        String url = "https://api.weixin.qq.com/sns/jscode2session";
        Map<String, String> param = new HashMap<>();
        param.put("appid", "wx1549d03167ecb49f");
        param.put("secret", "fbc96c4bb6093e4175fb20a6c0b19923");
        param.put("js_code", code);
        param.put("grant_type", "authorization_code");

        String wxResult = HttpClientUtil.doGet(url, param);
        System.out.println(wxResult);

        WXSessionModel model = JsonUtils.jsonToPojo(wxResult, WXSessionModel.class);

        JourneyUser user = new JourneyUser();
        user.setOpenid(model.getOpenid());
        user.setSessionkey(model.getSession_key());
        userService.addWechatUser(user);

        JourneyUser userNew = userService.findUserByOpenid(model.getOpenid());
        // 存入session到redis
//        redis.set("user-redis-session:" + model.getOpenid(),
//                model.getSession_key(),
//                1000 * 60 * 30);

        return JSONResult.ok(userNew);
    }


}
