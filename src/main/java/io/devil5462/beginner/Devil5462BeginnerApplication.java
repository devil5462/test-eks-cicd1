package io.devil5462.beginner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class Devil5462BeginnerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Devil5462BeginnerApplication.class, args);
	}
	
	@RequestMapping("/hello")
	  public @ResponseBody String hello() {
	    return "Hello, Spring Boot!";
	  }
}
