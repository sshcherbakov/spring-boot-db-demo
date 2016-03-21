package io.pivotal.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@Autowired
	JdbcTemplate template;

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String invokeService() {

		Integer res = template.queryForObject("select a from test", Integer.class);
		
		return "hello "+res;
		
	}

	
}
