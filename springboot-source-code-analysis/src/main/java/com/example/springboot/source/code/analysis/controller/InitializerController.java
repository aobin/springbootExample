package com.example.springboot.source.code.analysis.controller;

import com.example.springboot.source.code.analysis.service.TestFirstInitializerService;
import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * InitializerController 测试框架初始化器 ApplicationContextInitializer
 *
 * @author ipipman
 * @version V1.0
 * @date 2021/6/5
 * @date 2021/6/5 8:45 下午
 */
@RequestMapping("/initializer")
@RestController
public class InitializerController {
    /**
     * 测试框架初始化器 ApplicationContextInitializer
     */
    @Autowired
    private TestFirstInitializerService firstInitializerService;

    /**
     * 测试框架初始化器 ApplicationContextInitializer
     */
    @RequestMapping(value = "first", method = RequestMethod.GET)
    @ResponseBody
    public String testFirstInitializer(){
        return firstInitializerService.getCustomEnvironmentProperty();
    }

}
