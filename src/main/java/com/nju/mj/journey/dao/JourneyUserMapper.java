package com.nju.mj.journey.dao;

import com.nju.mj.journey.entity.JourneyUser;
import com.nju.mj.journey.entity.JourneyUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JourneyUserMapper {
    int countByExample(JourneyUserExample example);

    int deleteByExample(JourneyUserExample example);

    int deleteByPrimaryKey(String id);

    int insert(JourneyUser record);

    int insertSelective(JourneyUser record);

    List<JourneyUser> selectByExampleWithBLOBs(JourneyUserExample example);

    List<JourneyUser> selectByExample(JourneyUserExample example);

    JourneyUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") JourneyUser record, @Param("example") JourneyUserExample example);

    int updateByExampleWithBLOBs(@Param("record") JourneyUser record, @Param("example") JourneyUserExample example);

    int updateByExample(@Param("record") JourneyUser record, @Param("example") JourneyUserExample example);

    int updateByPrimaryKeySelective(JourneyUser record);

    int updateByPrimaryKeyWithBLOBs(JourneyUser record);

    int updateByPrimaryKey(JourneyUser record);
}