package com.songr.songr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Locale;

@Controller
@SpringBootApplication
public class SongrApplication {

	public static void main(String[] args) {
		SpringApplication.run(SongrApplication.class, args);

	}

	@GetMapping("/")
	@ResponseBody
	public static String renderTheGreeting(){
		return "Hello World!";
	}


}
