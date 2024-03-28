package com.spring.ex01;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "mainController2")  // id는 mainController
@RequestMapping(value="/test/*")
public class MainController2 {
	@RequestMapping(value ="/hi22.do", method = RequestMethod.GET)
	public ModelAndView main1(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav =new ModelAndView();
		mav.setViewName("main");
		return mav;
	}
	
	@RequestMapping(value = "/hi222.do")
	public ModelAndView main2(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav =new ModelAndView();
		mav.setViewName("main2");
		return mav;
	}
	
	@RequestMapping(value = "hi2222.do")
	public ModelAndView main3(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav =new ModelAndView();
		mav.setViewName("dkssud");
		return mav;
	}
	
	@RequestMapping(value = "/yaho/hi22222.do")
	public ModelAndView main4(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav =new ModelAndView();
		mav.setViewName("hi4");
		return mav;
	}
}
