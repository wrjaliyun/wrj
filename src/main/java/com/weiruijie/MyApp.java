package com.weiruijie;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.weiruijie.mapper")
public class MyApp {
	public static void main(String[] args) {
		SpringApplication.run(MyApp.class, args);
	}
}
