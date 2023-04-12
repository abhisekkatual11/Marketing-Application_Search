package com.search.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.search.dto.Lead;

@Controller
public class SearchController {
	//http://localhost:9090/search
	@RequestMapping("/search")
	public String search() {
		return "search_lead";
	}
	@Autowired
	private LeadRestClient leadRestCl;
	public String searchLead(@RequestParam("id") long id,Model model) {
		Lead lead = leadRestCl.getLead(id);
		model.addAttribute("leads", lead);
		return "get_lead";
	}
}
