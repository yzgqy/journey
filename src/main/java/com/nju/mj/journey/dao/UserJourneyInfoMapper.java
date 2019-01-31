package com.nju.mj.journey.dao;

import com.nju.mj.journey.entity.UserJourneyInfo;
import com.nju.mj.journey.entity.UserJourneyInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserJourneyInfoMapper {
    int countByExample(UserJourneyInfoExample example);

    int deleteByExample(UserJourneyInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(UserJourneyInfo record);

    int insertSelective(UserJourneyInfo record);

    List<UserJourneyInfo> selectByExample(UserJourneyInfoExample example);

    UserJourneyInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UserJourneyInfo record, @Param("example") UserJourneyInfoExample example);

    int updateByExample(@Param("record") UserJourneyInfo record, @Param("example") UserJourneyInfoExample example);

    int updateByPrimaryKeySelective(UserJourneyInfo record);

    int updateByPrimaryKey(UserJourneyInfo record);
}