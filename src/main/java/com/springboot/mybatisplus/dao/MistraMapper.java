package com.springboot.mybatisplus.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.springboot.mybatisplus.entity.Mistra;

import com.springboot.mybatisplus.vo.MistraVo;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Author: WangRui
 * Date: 2018/5/20
 * Describe: 一般写自定义sql才会用到，其他常用的crud在Impl里面可以直接调用IService的方法。
 */
@Repository
public interface MistraMapper extends BaseMapper<Mistra> {

    List<Mistra> customSql(MistraVo mistraVo);
}
