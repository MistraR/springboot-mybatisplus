package com.springboot.mybatisplus.controller;


import com.baomidou.mybatisplus.plugins.Page;
import com.springboot.mybatisplus.entity.Mistra;
import com.springboot.mybatisplus.service.MistraService;
import com.springboot.mybatisplus.util.query.PageCondition;
import com.springboot.mybatisplus.util.web.annotation.*;
import com.springboot.mybatisplus.vo.MistraVo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Author: WangRui
 * Date: 2018/5/20
 * Describe:
 */
@RestController
@RequestMapping("/mistra")
public class MistraController {

    @Autowired
    private MistraService mistraService;

    @ApiOperation("项目搭建成功测试")
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return "Mistra---测试成功！";
    }

    @ApiOperation("新增")
    @AddUrl
    public void get(MistraVo mistraVo) {
        mistraService.save(mistraVo);
    }

    @ApiOperation("删除单条")
    @DeleteUrl
    public void delete(Long id) {
        mistraService.delete(id);
    }

    @ApiOperation("获取单条")
    @GetMapping
    public Mistra get(Long id) {
        return mistraService.get(id);
    }

    @ApiOperation("修改")
    @UpdateUrl
    public void update(Mistra mistra) {
        mistraService.update(mistra);
    }

    @ApiOperation("查询所有")
    @SelectAllUrl
    public List<Mistra> selectAll() {
        return mistraService.selectAll();
    }

    @ApiOperation("分页查询+条件查询")
    @SelectPageUrl
    public Page<Mistra> selectPage(MistraVo mistraVo, PageCondition condition) {
        return mistraService.getPager(mistraVo, condition);
    }

    @ApiOperation("自定义sql测试")
    @GetMapping("/customSql")
    public List<Mistra> customSql(MistraVo mistraVo){
        return mistraService.customSql(mistraVo);
    }

}
