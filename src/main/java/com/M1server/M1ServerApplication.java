package com.M1server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class M1ServerApplication {

	public static void main(String[] args){
		SpringApplication.run(M1ServerApplication.class, args);
	}

}
