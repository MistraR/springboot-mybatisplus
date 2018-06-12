package com.springboot.mybatisplus.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.springboot.mybatisplus.entity.Mistra;
import com.springboot.mybatisplus.util.query.PageCondition;
import com.springboot.mybatisplus.vo.MistraVo;

import java.util.List;


/**
 * Author: WangRui
 * Date: 2018/5/20
 * Describe:
 */
public interface MistraService {

    void save(MistraVo mistraVo);

    void delete(Long id);

    Mistra get(Long id);

    void update(Mistra mistra);

    List<Mistra> selectAll();

    Page<Mistra> getPager(MistraVo mistraVo, PageCondition condition);

    List<Mistra> customSql(MistraVo mistraVo);
}
