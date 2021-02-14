package com.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.mvc.dao.coupondao;
import com.mvc.dao.customerdao;
import com.mvc.model.coupon;
import com.mvc.model.customer;

import com.mvc.service.service;



@Controller
public class CashController {
	@Autowired
	private customerdao customerdao;
	@Autowired
	private service cservice;
	@Autowired
	private coupondao coupondao1;
	@RequestMapping("/add-customer")
	public String addProducts(Model m) {
		m.addAttribute("title","Add product");
		
		return "newUser";
	}

	// handle add product
		@RequestMapping(value = "/processform",method=RequestMethod.POST)
		public RedirectView handleProduct(@ModelAttribute customer customer,HttpServletRequest request) {
			System.out.println(customer);
			customerdao.createProduct(customer);
			RedirectView redirectView = new RedirectView();
			redirectView.setUrl(request.getContextPath()+"/login");
			return redirectView;
		}

		// Login show
		@RequestMapping("/login")
		public String login(Model m) {
			m.addAttribute("title","Add product");
			
			return "index";
		}
	// Login Process	
		
		@RequestMapping(value = "/loginprocess", method = RequestMethod.POST)
		public String doLogin(@RequestParam("customerId") String customerId,
				Model model) {
			
		
		//boolean b=this.cservice.Validate(customerId);
			customer cs = cservice.Validate(customerId);
		if(cs!=null) {
		System.out.println("success");
			
			model.addAttribute("cs",cs);
			return "LoginSuccess";
		}
		else
		{
			System.out.println("fail");
			return "index";
		}

		}

		
		// add coupon page
		
		
		@RequestMapping(value = "/processClaim", method = RequestMethod.POST)
		public String doProcess(@RequestParam("couponCode") String couponCode,Model model) {
			
			coupon cp =  coupondao1.validateUser(couponCode);
			if(cp!=null) {
				
				return "couponSuccess";
			}
			
			return "couponNotSuccess";

		}
	
}
