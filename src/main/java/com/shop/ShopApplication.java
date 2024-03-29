package com.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ShopApplication {
	public static void main(String[] args) {
		SpringApplication.run(ShopApplication.class, args);
	}
}

@RestController
class HiController {

	@GetMapping("/hi")
	public String sayHi() {
		return "hi";
	}

	@GetMapping("/")
	public String home() {
		return "Welcome to the home page!";
	}
}
