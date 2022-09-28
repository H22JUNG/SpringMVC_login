package com.goodee.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.goodee.service.Service1;
import com.goodee.vo.UserVO;

@Controller
public class PageController {
	
	private Service1 service;
	

	public PageController(Service1 service) {
		super();
		this.service = service;
	}

	@GetMapping("/Controller1")
	public String move() {
		return "login/login1";
	}

	@PostMapping("/result1")
	public String login(UserVO vo) {
		if (service.login(vo)>0) {
			return "result/result1";
		}
		return "login/login1";
	}
	
	@GetMapping("/Controller2")
	public String move1() {
		return "login/login2";
	}
	
	@PostMapping("/result2")
	public String login2(UserVO vo, Model model) {
		if (service.login(vo)>0) {
			//리스트 가져오기
			service.getList(vo);
			
			
			return "result/result2";
		}
		return "login/login2";
	}
	
	

}
