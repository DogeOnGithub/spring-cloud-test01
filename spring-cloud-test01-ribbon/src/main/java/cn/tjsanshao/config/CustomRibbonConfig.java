package cn.tjsanshao.config;

/*
 * @Project:test01
 * @Description:custon ribbon config
 * @Author:TjSanshao
 * @Create:2018-12-07 10:23
 *
 **/

import cn.tjsanshao.annotation.ExcludeFromComponentScan;
import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ExcludeFromComponentScan
public class CustomRibbonConfig {

    //这里没有被SpringBoot扫描到，并没有一开始就注入到ioc容器
    //在指定RibbonClient后，应该是Ribbon自身进行注入以达到不同的微服务可以使用不同策略（纯属猜测）
    @Bean
    public IRule customRibbonRule() {
        return new CustomRibbonRule();
    }

}
