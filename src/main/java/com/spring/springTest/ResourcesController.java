package com.spring.springTest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/resources")
public class ResourcesController {
	
	@RequestMapping("/resources")
	public String resourcesGet() {
		return "1215/resources";
	}
	
}
