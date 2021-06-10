package com.example.demo.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import javax.ws.rs.core.MediaType;
import com.example.demo.Model.LearnTpoic;

@RestController
public class HelloController {
	@RequestMapping("/hello")
	public String getData() {
		return "Hiii";	
	}
	
	@RequestMapping("/learn")
	public List<LearnTpoic> getAllLear()
	{
		return Arrays.asList(new LearnTpoic ("Spring","Spring Boot","Spring Boot Desc"),
				new LearnTpoic ("Java","JavaTpont","java Boot Desc"));
	}
	
	
	private LearnTpoic getUsers() {
	     final String uri = "http://localhost:8282/learn";
	     RestTemplate restTemplate = new RestTemplate();
	     LearnTpoic result = restTemplate.getForObject(uri, LearnTpoic.class);      
	     System.out.println(result);
		return result; 
	}
	
	
	@RequestMapping(value = "/learnEmp",produces = {MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public LearnTpoic getUsers(
	      
	       @RequestHeader(name = "X-COM-LOCATION", defaultValue = "ASIA") String headerLocation) 
	{ 
		LearnTpoic learn = getUsers();
	    return learn;
	}
}
