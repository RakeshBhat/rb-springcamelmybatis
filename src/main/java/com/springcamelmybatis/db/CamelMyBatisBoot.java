package com.springcamelmybatis.db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CamelMyBatisBoot {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(CamelMyBatisBoot.class, args);
		Thread.sleep(7000);
	}

}
