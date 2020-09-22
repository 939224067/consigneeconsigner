package com.sunyo.wlpt.consigneeconsigner.controller;

import com.github.pagehelper.PageInfo;
import com.sunyo.wlpt.consigneeconsigner.model.Consigner;
import com.sunyo.wlpt.consigneeconsigner.model.ResultJson;
import com.sunyo.wlpt.consigneeconsigner.service.ConsignerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author shenhailong
 * <p>
 * 2020/9/15/15:33
 */
@RestController
@RequestMapping(value = "/consigner")
public class ConsignerController {

    @Autowired
    ConsignerService consignerService;

    /**
     * 发货人列表查询
     * @param companyName
     * @param pageSize
     * @param limitSize
     * @return
     */
    @RequestMapping(value = "/list")
    public ResultJson list(@RequestParam(value = "companyName", required = false) String companyName,
                           @RequestParam(value = "pageSize", defaultValue = "1") int pageSize,
                           @RequestParam(value = "limitSize", defaultValue = "100") int limitSize){

        PageInfo<Consigner> pageInfo = consignerService.selectList(companyName, pageSize, limitSize);

        return new ResultJson("200", "success", pageInfo);
    }

    /**
     * 发货人删除
     * @param id
     * @return
     */
    @DeleteMapping(value = "/remove")
    public ResultJson remove(@RequestParam(value = "id") Integer id){

        int i = consignerService.deleteByPrimaryKey(id);
        if (i > 0){
            return new ResultJson("200", "success");
        }else {
            return new ResultJson("201", "error");
        }
    }

    /**
     * 发货人添加
     * @param consigner
     * @return
     */
    @PostMapping(value = "/add")
    public ResultJson add (@RequestBody Consigner consigner){

        int i = consignerService.insertSelective(consigner);
        if (i > 0){
            return new ResultJson("200", "success");
        }else {
            return new ResultJson("201", "error");
        }
    }

    /**
     * 发货人更新
     * @param consigner
     * @return
     */
    @PutMapping(value = "/edit")
    public ResultJson edit (@RequestBody Consigner consigner){

        int i = consignerService.updateByPrimaryKeySelective(consigner);
        if (i > 0){
            return new ResultJson("200", "success");
        }else {
            return new ResultJson("201", "error");
        }
    }

}
