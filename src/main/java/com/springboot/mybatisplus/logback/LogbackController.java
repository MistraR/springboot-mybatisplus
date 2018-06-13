package com.springboot.mybatisplus.logback;

import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Author: WangRui
 * Date: 2018/5/19
 * Describe:
 */
@RestController
@RequestMapping("/logback")
public class LogbackController {
    private static Logger LOGGER = LoggerFactory.getLogger(LogbackController.class);

    @ApiOperation("logback日志测试")
    @RequestMapping("/get")
    public void get(){
        LOGGER.info("logback日志---info测试");
        LOGGER.debug("logback日志---debug测试");
    }
}
