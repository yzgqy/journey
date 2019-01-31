package com.nju.mj.journey.dao;

import com.nju.mj.journey.entity.Journey;
import com.nju.mj.journey.entity.JourneyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JourneyMapper {
    int countByExample(JourneyExample example);

    int deleteByExample(JourneyExample example);

    int deleteByPrimaryKey(String id);

    int insert(Journey record);

    int insertSelective(Journey record);

    List<Journey> selectByExampleWithBLOBs(JourneyExample example);

    List<Journey> selectByExample(JourneyExample example);

    Journey selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Journey record, @Param("example") JourneyExample example);

    int updateByExampleWithBLOBs(@Param("record") Journey record, @Param("example") JourneyExample example);

    int updateByExample(@Param("record") Journey record, @Param("example") JourneyExample example);

    int updateByPrimaryKeySelective(Journey record);

    int updateByPrimaryKeyWithBLOBs(Journey record);

    int updateByPrimaryKey(Journey record);
}