package com.springboot.mybatisplus.service.Impl;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.springboot.mybatisplus.dao.MistraMapper;
import com.springboot.mybatisplus.entity.Mistra;
import com.springboot.mybatisplus.service.MistraService;
import com.springboot.mybatisplus.util.query.PageCondition;
import com.springboot.mybatisplus.vo.MistraVo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Author: WangRui
 * Date: 2018/5/20
 * Describe:
 */
@Service
public class MistraServiceImpl extends ServiceImpl<MistraMapper, Mistra> implements MistraService {

    @Autowired
    private MistraMapper mistraMapper;

    /**
     * 新增
     *
     * @param mistraVo
     */
    @Override
    public void save(MistraVo mistraVo) {
        Mistra mistra = new Mistra();
        mistra.setName(mistraVo.getName());
        mistra.setSex(mistraVo.getSex());
        mistra.setAge(mistraVo.getAge());
        mistraMapper.insert(mistra);
    }

    /**
     * 删除单条
     *
     * @param id
     */
    @Override
    public void delete(Long id) {
        mistraMapper.deleteById(id);
    }

    /**
     * 查询单条
     *
     * @param id
     * @return
     */
    @Override
    public Mistra get(Long id) {
        return mistraMapper.selectById(id);
    }

    /**
     * 修改
     *
     * @param mistra
     */
    @Override
    public void update(Mistra mistra) {
        mistraMapper.updateById(mistra);
    }

    /**
     * 条件查询
     *
     * @param mistraVo
     * @return
     */
    @Override
    public List<Mistra> selectAll(MistraVo mistraVo) {
        List<Mistra> mistraList = mistraMapper.selectList(
                new EntityWrapper<Mistra>().eq("name", mistraVo.getName())
        );
        return mistraList;
    }

    /**
     * 条件查询，分页查询
     *
     * @param mistraVo
     * @return
     */
    @Override
    public Page<Mistra> getPager(MistraVo mistraVo, PageCondition condition) {
        Page<Mistra> page = new Page<Mistra>(condition.getPageNum(), condition.getPageSize());
        Wrapper<Mistra> eWrapper = new EntityWrapper<Mistra>().like(StringUtils.isNoneBlank(mistraVo.getName()), "name", mistraVo.getName());
        page = selectPage(page, eWrapper);
        return page;
    }

    @Override
    public List<Mistra> customSql(MistraVo mistraVo) {
        return mistraMapper.customSql(mistraVo);
    }
}
