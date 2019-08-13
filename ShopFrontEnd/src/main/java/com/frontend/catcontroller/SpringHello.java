package com.frontend.catcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SpringHello {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String Welcome() {
		return "HomePage";
	}

}
