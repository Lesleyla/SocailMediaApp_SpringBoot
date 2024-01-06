package com.Lesley.restWebservices.restfulwebservices.helloWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//REST API
@RestController
public class HelloWorldController {
	// /hello-world
	@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
	public String helloworld() {
		return "Hello World!";
	}

}
