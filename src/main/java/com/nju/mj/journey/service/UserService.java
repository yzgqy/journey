package com.nju.mj.journey.service;

import com.nju.mj.journey.entity.JourneyUser;

public interface UserService {
    public String addUser(JourneyUser user);
    public void updatedUser(JourneyUser user);
    public JourneyUser findUserByUserId(String userId);
    public JourneyUser findUserByOpenid(String openId);
    public void updatedUserByOpenid(JourneyUser user);
    public void addWechatUser(JourneyUser user);
    public JourneyUser login(String nickname);
}
