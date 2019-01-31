package com.nju.mj.journey.dao;

import com.nju.mj.journey.entity.Participant;
import com.nju.mj.journey.entity.ParticipantExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParticipantMapper {
    int countByExample(ParticipantExample example);

    int deleteByExample(ParticipantExample example);

    int deleteByPrimaryKey(String id);

    int insert(Participant record);

    int insertSelective(Participant record);

    List<Participant> selectByExampleWithBLOBs(ParticipantExample example);

    List<Participant> selectByExample(ParticipantExample example);

    Participant selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Participant record, @Param("example") ParticipantExample example);

    int updateByExampleWithBLOBs(@Param("record") Participant record, @Param("example") ParticipantExample example);

    int updateByExample(@Param("record") Participant record, @Param("example") ParticipantExample example);

    int updateByPrimaryKeySelective(Participant record);

    int updateByPrimaryKeyWithBLOBs(Participant record);

    int updateByPrimaryKey(Participant record);
}