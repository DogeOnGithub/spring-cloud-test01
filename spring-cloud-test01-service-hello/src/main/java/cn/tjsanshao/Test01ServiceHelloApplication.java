package cn.tjsanshao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Test01ServiceHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(Test01ServiceHelloApplication.class, args);
	}
}
