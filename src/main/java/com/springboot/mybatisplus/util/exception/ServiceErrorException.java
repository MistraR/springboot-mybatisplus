package com.springboot.mybatisplus.util.exception;


import com.springboot.mybatisplus.util.web.ResultCode;

/**
 * Author : WangRui
 * Date : 2018/5/20
 * Describe:
 */
public class ServiceErrorException extends BaseServiceException {

    public ServiceErrorException(String message) {
        super(ResultCode.SERVICE_ERROR, message);
    }
}
