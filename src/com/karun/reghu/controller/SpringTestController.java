package com.karun.reghu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 
 * @author reghu
 * @Descritpion This Controller is to test Spring initialization 
 */
@Controller
public class SpringTestController {

	/**
	 * @Description redirect to returned jsp page
	 * @return main-menu.jsp
	 */
	@RequestMapping("/")
	public String showMyPage() {
		return "main-menu";
	}
}
