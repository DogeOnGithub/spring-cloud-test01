package cn.tjsanshao.controller;

/*
 * @Project:test01
 * @Description:index controller
 * @Author:TjSanshao
 * @Create:2018-12-07 16:02
 *
 **/

import cn.tjsanshao.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/index")
    public String index() {
        return helloService.callFromRemoteServiceTest();
    }

}
