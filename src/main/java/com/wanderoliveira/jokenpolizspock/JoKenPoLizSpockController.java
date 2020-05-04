package com.wanderoliveira.jokenpolizspock;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JoKenPoLizSpockController {

	@GetMapping("/api")
	@ResponseBody
	public String hello() {
		return "Ola SPring!";
	}

}
