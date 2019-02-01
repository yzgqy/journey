package com.nju.mj.journey.service;

import com.nju.mj.journey.entity.Journey;
import com.nju.mj.journey.entity.JourneyUser;

import java.util.List;

public interface UserService {
    public void addUser(JourneyUser user);
    public void updatedUser(JourneyUser user);
    public JourneyUser findUserByUserId(String userId);
}
