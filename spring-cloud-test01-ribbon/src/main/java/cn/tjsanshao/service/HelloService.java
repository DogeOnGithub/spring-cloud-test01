package cn.tjsanshao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/*
 * @Project:test01
 * @Description:hello service
 * @Author:TjSanshao
 * @Create:2018-12-06 16:51
 *
 **/
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    public String hello(String name) {
        return restTemplate.getForObject("http://SERVICE-HELLO/hello", String.class);
    }

}
