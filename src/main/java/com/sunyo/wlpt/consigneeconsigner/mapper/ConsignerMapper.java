package com.sunyo.wlpt.consigneeconsigner.mapper;

import com.sunyo.wlpt.consigneeconsigner.model.Consigner;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ConsignerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Consigner record);

    int insertSelective(Consigner record);

    Consigner selectByPrimaryKey(Integer id);

    List<Consigner> selectList(@Param("companyName") String companyName);

    int updateByPrimaryKeySelective(Consigner record);

    int updateByPrimaryKey(Consigner record);
}