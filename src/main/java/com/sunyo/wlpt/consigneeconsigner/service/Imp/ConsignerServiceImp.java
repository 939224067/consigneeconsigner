package com.sunyo.wlpt.consigneeconsigner.service.Imp;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sunyo.wlpt.consigneeconsigner.mapper.ConsignerMapper;
import com.sunyo.wlpt.consigneeconsigner.model.Consigner;
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
public class ConsignerServiceImp implements ConsignerService {

    @Autowired
    ConsignerMapper consignerMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return consignerMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Consigner record) {
        return 0;
    }

    @Override
    public int insertSelective(Consigner record) {
        return consignerMapper.insertSelective(record);
    }

    @Override
    public Consigner selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public PageInfo<Consigner> selectList(String companyName, int pageSize, int limitSize) {

        Page<Consigner> page = PageHelper.startPage(pageSize, limitSize);
        List<Consigner> consignerList = consignerMapper.selectList(companyName);

        PageInfo<Consigner> consignerPageInfo = new PageInfo<Consigner>(consignerList);
        return consignerPageInfo;
    }

    @Override
    public int updateByPrimaryKeySelective(Consigner record) {
        return consignerMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Consigner record) {
        return 0;
    }
}
