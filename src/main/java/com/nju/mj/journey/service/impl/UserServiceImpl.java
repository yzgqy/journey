package com.nju.mj.journey.service.impl;

import com.nju.mj.journey.dao.JourneyUserMapper;
import com.nju.mj.journey.entity.JourneyUser;
import com.nju.mj.journey.entity.JourneyUserExample;
import com.nju.mj.journey.service.UserService;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

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

    @Override
    public JourneyUser findUserByOpenid(String openId) {
        JourneyUserExample userExample = new JourneyUserExample();
        JourneyUserExample.Criteria criteria = userExample.createCriteria();
        criteria.andOpenidEqualTo(openId);
        List<JourneyUser> users = journeyUserMapper.selectByExample(userExample);
        if(users!=null && users.size()>0)
            return users.get(0);
        else
            return null;
    }

    @Override
    public void updatedUserByOpenid(JourneyUser user) {

    }

    @Override
    public void addWechatUser(JourneyUser user) {
        JourneyUserExample userExample = new JourneyUserExample();
        JourneyUserExample.Criteria criteria = userExample.createCriteria();
        criteria.andOpenidEqualTo(user.getOpenid());
        List<JourneyUser> users = journeyUserMapper.selectByExample(userExample);
        if(users!=null&&users.size()>0) {
            JourneyUser oldUser = users.get(0);
            user.setId(oldUser.getId());
            updatedUser(user);
        }else {
            addUser(user);
        }
    }


}
