package cn.tjsanshao.config;

/*
 * @Project:test01
 * @Description:ribbon config
 * @Author:TjSanshao
 * @Create:2018-12-06 16:50
 *
 **/

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RibbonConfig {

    //注入到ioc容器，loadBalanced开始负载均衡
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    //默认情况下，Ribbon使用轮询算法，注入IRule可以替换掉默认算法
    @Bean
    public IRule rule() {
        return new RandomRule();
    }

}
