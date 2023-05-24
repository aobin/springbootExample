package com.ipman.springcloud.nacos.config.sample.controller;

import com.ipman.springcloud.nacos.config.sample.config.DynamicThreadPool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/threadpool")
public class ThreadPoolController {

    @Autowired
    private DynamicThreadPool dynamicThreadPool;

    /**
     * 打印当前线程池的状态
     */
    @GetMapping("/print")
    public String printThreadPoolStatus() {
        return dynamicThreadPool.printThreadPoolStatus();
    }

    /**
     * 给线程池增加任务
     *
     * @param count
     */
    @GetMapping("/add")
    public String dynamicThreadPoolAddTask(@RequestParam int count) {
        dynamicThreadPool.dynamicThreadPoolAddTask(count);
        return String.valueOf(count);
    }
}