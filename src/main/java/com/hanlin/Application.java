package com.hanlin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hanlin.mapper")
public class Application {
	public static void main(String[] args) {
		//默认的
		//SpringApplication.run(Application.class, args);
		
//博客地址: https://blog.csdn.net/u011870280/article/details/80025387
        SpringApplication springApplication = new SpringApplication(Application.class);
        springApplication.setBannerMode(Mode.LOG);
        springApplication.run(args);
	}	   
}
