package com.example.schedlockdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SchedlockdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchedlockdemoApplication.class, args);
	}

}
