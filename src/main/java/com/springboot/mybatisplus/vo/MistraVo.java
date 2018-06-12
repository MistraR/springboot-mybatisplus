package com.springboot.mybatisplus.vo;

import io.swagger.annotations.ApiParam;
import lombok.Data;

/**
 * Author: WangRui
 * Date: 2018/6/6
 * Describe:
 */
@Data
public class MistraVo {

    @ApiParam("姓名")
    private String name;

    @ApiParam("性别")
    private Integer sex;

    @ApiParam("年龄")
    private Integer age;

}
