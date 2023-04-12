package com.search.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.search.dto.Lead;
@Component
public class LeadRestClient {
	public Lead getLead(long id) {
		RestTemplate rest=new RestTemplate();
		Lead lead = rest.getForObject("http://localhost:8080/api/lead/getId/"+id,Lead.class);
		return lead;
	}
}
