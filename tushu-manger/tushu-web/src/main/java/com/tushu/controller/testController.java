package com.tushu.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tushu.pojo.User;
import com.tushu.service.test;

@Controller
public class testController {

	@Autowired
	private test test;
	@ResponseBody
	@RequestMapping("/q/{id}")
	public User getallbyid(@PathVariable int id){
		User list = test.getallbyid(id);
		return list;
	}
	 
}
