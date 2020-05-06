package ru.altstu.lyuty.spring_app_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "ru.altstu.lyuty.spring_app_demo")
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
