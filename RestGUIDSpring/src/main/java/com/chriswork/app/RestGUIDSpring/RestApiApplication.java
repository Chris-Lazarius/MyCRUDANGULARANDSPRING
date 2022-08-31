package com.chriswork.app.RestGUIDSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class RestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiApplication.class, args);
	}

	@GetMapping(value = "/")
    public String getPage2()
    {
        return "Hello Mr Chris";
    }

}
