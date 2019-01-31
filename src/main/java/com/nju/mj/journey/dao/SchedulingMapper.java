package com.nju.mj.journey.dao;

import com.nju.mj.journey.entity.Scheduling;
import com.nju.mj.journey.entity.SchedulingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchedulingMapper {
    int countByExample(SchedulingExample example);

    int deleteByExample(SchedulingExample example);

    int deleteByPrimaryKey(String id);

    int insert(Scheduling record);

    int insertSelective(Scheduling record);

    List<Scheduling> selectByExample(SchedulingExample example);

    Scheduling selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Scheduling record, @Param("example") SchedulingExample example);

    int updateByExample(@Param("record") Scheduling record, @Param("example") SchedulingExample example);

    int updateByPrimaryKeySelective(Scheduling record);

    int updateByPrimaryKey(Scheduling record);
}