package com.nju.mj.journey.service.impl;

import com.nju.mj.journey.dao.JourneyUserMapper;
import com.nju.mj.journey.entity.JourneyUser;
import com.nju.mj.journey.service.UserService;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private JourneyUserMapper journeyUserMapper;
    @Autowired
    private Sid sid;

    @Override
    public void addUser(JourneyUser user) {
        String id = sid.nextShort();
        user.setId(id);
        user.setFlag(1);
        user.setUpdatedat(new Date());
        user.setCreatedat(new Date());
        journeyUserMapper.insertSelective(user);
    }

    @Override
    public void updatedUser(JourneyUser user) {
        user.setUpdatedat(new Date());
        journeyUserMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public JourneyUser findUserByUserId(String userId) {
        JourneyUser user = journeyUserMapper.selectByPrimaryKey(userId);
        if (user != null) {
            if (user.getFlag() == 0)
                return null;
        }
        return user;
    }

}
