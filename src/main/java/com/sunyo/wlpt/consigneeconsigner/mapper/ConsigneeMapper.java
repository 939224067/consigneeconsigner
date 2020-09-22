package com.sunyo.wlpt.consigneeconsigner.mapper;

import com.sunyo.wlpt.consigneeconsigner.model.Consignee;
import com.sunyo.wlpt.consigneeconsigner.model.Consigner;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ConsigneeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Consignee record);

    int insertSelective(Consignee record);

    Consignee selectByPrimaryKey(Integer id);

    List<Consignee> selectList(@Param("companyName") String companyName);

    int updateByPrimaryKeySelective(Consignee record);

    int updateByPrimaryKey(Consignee record);
}