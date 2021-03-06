package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.demo.controller"})
@SpringBootApplication
public class WeatherforecastApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherforecastApplication.class, args);
	}

}
