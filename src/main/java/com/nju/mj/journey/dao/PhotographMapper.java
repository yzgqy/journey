package com.nju.mj.journey.dao;

import com.nju.mj.journey.entity.Photograph;
import com.nju.mj.journey.entity.PhotographExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PhotographMapper {
    int countByExample(PhotographExample example);

    int deleteByExample(PhotographExample example);

    int deleteByPrimaryKey(String id);

    int insert(Photograph record);

    int insertSelective(Photograph record);

    List<Photograph> selectByExampleWithBLOBs(PhotographExample example);

    List<Photograph> selectByExample(PhotographExample example);

    Photograph selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Photograph record, @Param("example") PhotographExample example);

    int updateByExampleWithBLOBs(@Param("record") Photograph record, @Param("example") PhotographExample example);

    int updateByExample(@Param("record") Photograph record, @Param("example") PhotographExample example);

    int updateByPrimaryKeySelective(Photograph record);

    int updateByPrimaryKeyWithBLOBs(Photograph record);

    int updateByPrimaryKey(Photograph record);
}