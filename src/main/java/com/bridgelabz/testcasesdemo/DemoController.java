package com.bridgelabz.testcasesdemo;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/demo")
	public Response get(HttpServletResponse response) {
		response.addHeader("name", "Sid");
		return new Response("Shri Ganesha", 100);
	}
	
	@PostMapping("/add")
	public Response add(@RequestBody Addition addition, @RequestHeader int thirdNumber, @RequestHeader String result) {
		return new Response(result, addition.getNum1() + addition.getNum2() + thirdNumber);
	}
	
}
