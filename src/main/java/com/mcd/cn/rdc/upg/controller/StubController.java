package com.mcd.cn.rdc.upg.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 挡板接口
 *
 * @author liyu
 */
@RequestMapping(value = "/test")
@RestController
public class StubController {

    public static int num = 0;

    @PostMapping("/stub")
    public String selectMethod(String request) throws Exception {
        num++;
        return "请求成功:" + num;
    }
}
