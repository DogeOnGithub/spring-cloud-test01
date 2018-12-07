package cn.tjsanshao.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/*
 * @Project:test01
 * @Description:hello service remote call
 * @Author:TjSanshao
 * @Create:2018-12-07 15:59
 *
 **/
@FeignClient(name = "service-hello")   //表明该接口是一个FeignClient，需要访问的服务名称是service-hello
public interface HelloService {

    //RequestMapping中的value指定服务的访问路径，method指定访问方法，如果需要带参数，在接口方法参数列表中使用@RequestParam注解表明
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String callFromRemoteServiceTest();

}
