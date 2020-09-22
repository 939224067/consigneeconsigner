package com.sunyo.wlpt.consigneeconsigner.service;

import com.github.pagehelper.PageInfo;
import com.sunyo.wlpt.consigneeconsigner.model.Consigner;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author shenhailong
 * <p>
 * 2020/9/15/15:34
 */
public interface ConsignerService {

    int deleteByPrimaryKey(Integer id);

    int insert(Consigner record);

    int insertSelective(Consigner record);

    Consigner selectByPrimaryKey(Integer id);

    PageInfo<Consigner> selectList(String companyName, int pageSize, int limitSize);

    int updateByPrimaryKeySelective(Consigner record);

    int updateByPrimaryKey(Consigner record);

}
