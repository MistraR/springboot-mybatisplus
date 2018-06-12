package com.springboot.mybatisplus.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.mapper.SqlCondition;
import io.swagger.annotations.ApiParam;
import lombok.Data;

/**
 * Author: WangRui
 * Date: 2018/5/20
 * Describe:
 */
@Data
@TableName("mistra")
public class Mistra {

    @ApiParam("主键id")
    @TableId(value="id")
    private Long id;

    /**
     * TableField 的value可为空，驼峰命名方式自动识别
     */
    @ApiParam("姓名")
    @TableField(value = "name")
    private String name;

    @ApiParam("性别")
    @TableField("sex")
    private Integer sex;

    @ApiParam("年龄")
    @TableField("age")
    private Integer age;

    /**
     * 使用数据库时间,输出 SQL 为：update 表 set 字段=now() where ...
     */
    @ApiParam("更新时间")
    @TableField(value = "modifyTime",update = "now()")
    private String modifyTime;

    /**
     * 表示类中有的属性，而对应的属性在表中没有这样的一个字段,不映射
     */
    @TableField(exist = false)
    private String testField;
}
