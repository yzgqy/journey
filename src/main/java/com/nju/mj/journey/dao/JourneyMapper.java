package com.nju.mj.journey.dao;

import com.nju.mj.journey.entity.Journey;
import com.nju.mj.journey.entity.JourneyExample;
import com.nju.mj.journey.entity.JourneyWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JourneyMapper {
    int countByExample(JourneyExample example);

    int deleteByExample(JourneyExample example);

    int deleteByPrimaryKey(String id);

    int insert(JourneyWithBLOBs record);

    int insertSelective(JourneyWithBLOBs record);

    List<JourneyWithBLOBs> selectByExampleWithBLOBs(JourneyExample example);

    List<Journey> selectByExample(JourneyExample example);

    JourneyWithBLOBs selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") JourneyWithBLOBs record, @Param("example") JourneyExample example);

    int updateByExampleWithBLOBs(@Param("record") JourneyWithBLOBs record, @Param("example") JourneyExample example);

    int updateByExample(@Param("record") Journey record, @Param("example") JourneyExample example);

    int updateByPrimaryKeySelective(JourneyWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(JourneyWithBLOBs record);

    int updateByPrimaryKey(Journey record);
}