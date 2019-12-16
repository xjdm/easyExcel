package com.excel.easyexcel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.excel"})
public class EasyexcelApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyexcelApplication.class, args);
	}

}
