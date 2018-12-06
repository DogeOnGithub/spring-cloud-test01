package cn.tjsanshao.controller;

/*
 * @Project:test01
 * @Description:hello service
 * @Author:TjSanshao
 * @Create:2018-12-06 15:18
 *
 **/

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/hello")
    public String hello(){
        return "hello, this is " + port;
    }

}
