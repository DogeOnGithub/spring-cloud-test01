package cn.tjsanshao.controller;

import cn.tjsanshao.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @Project:test01
 * @Description:index
 * @Author:TjSanshao
 * @Create:2018-12-06 16:55
 *
 **/
@RestController
public class IndexController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/index")
    public String index() {
        return helloService.hello("TjSanshao");
    }

}
