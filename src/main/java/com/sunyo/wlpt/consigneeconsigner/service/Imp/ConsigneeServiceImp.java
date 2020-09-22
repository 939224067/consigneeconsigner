package com.sunyo.wlpt.consigneeconsigner.service.Imp;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sunyo.wlpt.consigneeconsigner.mapper.ConsigneeMapper;
import com.sunyo.wlpt.consigneeconsigner.mapper.ConsignerMapper;
import com.sunyo.wlpt.consigneeconsigner.model.Consignee;
import com.sunyo.wlpt.consigneeconsigner.model.Consigner;
import com.sunyo.wlpt.consigneeconsigner.service.ConsigneeService;
import com.sunyo.wlpt.consigneeconsigner.service.ConsignerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author shenhailong
 * <p>
 * 2020/9/15/15:35
 */
@Service
public class ConsigneeServiceImp implements ConsigneeService {

    @Autowired
    ConsigneeMapper consigneeMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return consigneeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Consignee record) {
        return 0;
    }

    @Override
    public int insertSelective(Consignee record) {
        return consigneeMapper.insertSelective(record);
    }

    @Override
    public Consignee selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public PageInfo<Consignee> selectList(String companyName, int pageSize, int limitSize) {

        Page<Consignee> page = PageHelper.startPage(pageSize, limitSize);
        List<Consignee> consignerList = consigneeMapper.selectList(companyName);

        PageInfo<Consignee> consignerPageInfo = new PageInfo<Consignee>(consignerList);
        return consignerPageInfo;
    }

    @Override
    public int updateByPrimaryKeySelective(Consignee record) {
        return consigneeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Consignee record) {
        return 0;
    }
}
