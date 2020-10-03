package com.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.biz.impl.TeacherBizImpl;
import com.entity.Teacher;

@Controller
@RequestMapping("/teacher")
public class TeacherController {

	@Resource(name="teacherBizImpl")
	private TeacherBizImpl dao;
	
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	
	@RequestMapping("/doLogin")
	public String doLogin(Teacher tea,Model model) {
		System.out.println("==kkkkk==");
//		Teacher gettea= dao.findTeacher(tea);
		
		System.out.println(dao.getAll());
//		if(gettea==null) {
//			return "login";
//		}else {
//			model.addAttribute("tea",dao.getAll());
			return "success";
//		}
		
	}
}
