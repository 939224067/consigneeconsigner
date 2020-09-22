package com.sunyo.wlpt.consigneeconsigner.controller;

import com.github.pagehelper.PageInfo;
import com.sunyo.wlpt.consigneeconsigner.model.Consignee;
import com.sunyo.wlpt.consigneeconsigner.model.Consigner;
import com.sunyo.wlpt.consigneeconsigner.model.ResultJson;
import com.sunyo.wlpt.consigneeconsigner.service.ConsigneeService;
import com.sunyo.wlpt.consigneeconsigner.service.ConsignerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author shenhailong
 * <p>
 * 2020/9/15/15:33
 */
@RestController
@RequestMapping(value = "/consignee")
public class ConsigneeController {

    @Autowired
    ConsigneeService consigneeService;

    @RequestMapping(value = "/list")
    public ResultJson list(@RequestParam(value = "companyName", required = false) String companyName,
                           @RequestParam(value = "pageSize", defaultValue = "1") int pageSize,
                           @RequestParam(value = "limitSize", defaultValue = "100") int limitSize){

        PageInfo<Consignee> pageInfo = consigneeService.selectList(companyName, pageSize, limitSize);

        return new ResultJson("200", "success", pageInfo);
    }

    /**
     * 收货人删除
     * @param id
     * @return
     */
    @DeleteMapping(value = "/remove")
    public ResultJson remove(@RequestParam(value = "id") Integer id){

        int i = consigneeService.deleteByPrimaryKey(id);
        if (i > 0){
            return new ResultJson("200", "success");
        }else {
            return new ResultJson("201", "error");
        }
    }

    /**
     * 收货人添加
     * @param consignee
     * @return
     */
    @PostMapping(value = "/add")
    public ResultJson add (@RequestBody Consignee consignee){

        int i = consigneeService.insertSelective(consignee);
        if (i > 0){
            return new ResultJson("200", "success");
        }else {
            return new ResultJson("201", "error");
        }
    }

    /**
     * 收货人更新
     * @param consignee
     * @return
     */
    @PutMapping(value = "/edit")
    public ResultJson edit (@RequestBody Consignee consignee){

        int i = consigneeService.updateByPrimaryKeySelective(consignee);
        if (i > 0){
            return new ResultJson("200", "success");
        }else {
            return new ResultJson("201", "error");
        }
    }

}
