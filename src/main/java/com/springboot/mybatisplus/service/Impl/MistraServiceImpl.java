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
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
        BeanUtils.copyProperties(mistraVo, mistra);
        insert(mistra);
    }

    /**
     * 删除单条
     *
     * @param id
     */
    @Override
    public void delete(Long id) {
        deleteById(id);
    }

    /**
     * 查询单条
     *
     * @param id
     * @return
     */
    @Override
    public Mistra get(Long id) {
        return selectById(id);
    }

    /**
     * 修改
     *
     * @param mistra
     */
    @Override
    public void update(Mistra mistra) {
        updateById(mistra);
    }

    /**
     * 查询所有
     *
     * @return
     */
    @Override
    public List<Mistra> selectAll() {
        List<Mistra> mistraList = selectList(
                new EntityWrapper<Mistra>()
        );
        return mistraList;
    }

    /**
     * 条件查询，分页查询
     * 分页查询时，分页插件会自动填充数据总行数和总页数
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

    /**
     * 自定义sql
     *
     * @param mistraVo
     * @return
     */
    @Override
    public List<Mistra> customSql(MistraVo mistraVo) {
        return mistraMapper.customSql(mistraVo);
    }

    List<MistraVo> voConvertList(List<Mistra> list) {
        if (list.size() > 0) {
            List<MistraVo> mistraVoList = new ArrayList<>();
            list.forEach(mistra ->
                    mistraVoList.add(convertVo(mistra)));
            return mistraVoList;
        } else {
            return null;
        }
    }

    /**
     * 实体类与查询类转换
     *
     * @param mistra
     * @return
     */
    public MistraVo convertVo(Mistra mistra) {
        if (mistra != null) {
            MistraVo mistraVo = new MistraVo();
            BeanUtils.copyProperties(mistra, mistraVo);
            return mistraVo;
        } else {
            return null;
        }
    }
}
