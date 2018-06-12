package com.springboot.mybatisplus.util.query;

import io.swagger.annotations.ApiParam;
import lombok.Data;

/**
 * Author: WangRUi
 * Time: 2018/6/12/012
 * Describe:
 */
@Data
public class PageCondition {

    @ApiParam("页数")
    private int pageNum = 0;

    @ApiParam("每页数量")
    private int pageSize = 15;

    @ApiParam("排序字段")
    private String order;

    @ApiParam("排序规则 默认降序，升序=ASC")
    private String orderBy = "DESC";
}
