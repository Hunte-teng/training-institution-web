package com.example.gradledemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.dao")
public class GradleDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradleDemoApplication.class, args);
	}
}
