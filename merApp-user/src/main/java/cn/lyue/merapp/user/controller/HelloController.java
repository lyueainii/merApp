package cn.lyue.merapp.user.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @Author: Liu Yue
 * @Version: 1.0
 * @Date: 2021/1/16 15:05
 * @Description:
 **/
@RestController
@RequestMapping(path="/hello")
public class HelloController {
    @PostMapping("/test")
    public String hello(@RequestBody Test test){
        return "hello";
    }
    @GetMapping("/get")
    public String hello(){
        return "hello,world";
    }
}
