package cn.tjsanshao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Test01ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Test01ServerApplication.class, args);
	}
}
