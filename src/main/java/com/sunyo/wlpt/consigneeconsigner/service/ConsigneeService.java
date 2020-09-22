package com.sunyo.wlpt.consigneeconsigner.service;

import com.github.pagehelper.PageInfo;
import com.sunyo.wlpt.consigneeconsigner.model.Consignee;
import com.sunyo.wlpt.consigneeconsigner.model.Consigner;

/**
 * @author shenhailong
 * <p>
 * 2020/9/15/15:34
 */
public interface ConsigneeService {

    int deleteByPrimaryKey(Integer id);

    int insert(Consignee record);

    int insertSelective(Consignee record);

    Consignee selectByPrimaryKey(Integer id);

    PageInfo<Consignee> selectList(String companyName, int pageSize, int limitSize);

    int updateByPrimaryKeySelective(Consignee record);

    int updateByPrimaryKey(Consignee record);

}
