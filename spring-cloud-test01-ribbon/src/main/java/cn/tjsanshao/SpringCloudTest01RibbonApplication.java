package cn.tjsanshao;

import cn.tjsanshao.annotation.ExcludeFromComponentScan;
import cn.tjsanshao.config.CustomRibbonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@EnableEurekaClient
@EnableDiscoveryClient
/*
 *关于以上两个注解的区别
 *如果选用的注册中心是eureka，那么就推荐@EnableEurekaClient
 * 如果是其他的注册中心，那么推荐使用@EnableDiscoveryClient
 */
@SpringBootApplication
@ComponentScan(excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = ExcludeFromComponentScan.class)})
@RibbonClient(name = "SERVICE-HELLO", configuration = CustomRibbonConfig.class)
public class SpringCloudTest01RibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudTest01RibbonApplication.class, args);
	}
}
