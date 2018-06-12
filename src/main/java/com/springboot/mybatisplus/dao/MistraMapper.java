package com.springboot.mybatisplus.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.springboot.mybatisplus.entity.Mistra;

import com.springboot.mybatisplus.vo.MistraVo;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Author: WangRui
 * Date: 2018/5/20
 * Describe:
 */
@Repository
public interface MistraMapper extends BaseMapper<Mistra> {

    List<Mistra> customSql(MistraVo mistraVo);
}
