package com.activity.spring.web;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.activity.spring.bean.CustomerBean;
import com.activity.spring.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
	   SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	    
	   binder.registerCustomEditor(Date.class,"custDob", new CustomDateEditor(sdf, true));
	}
	
	@RequestMapping(value="/LoadAddCustomer", method=RequestMethod.GET)
	public ModelAndView LoadAddCustomer(){
		ModelAndView mv=new ModelAndView();
		mv.setViewName("CreateCustomer");
		mv.addObject("custBean", new CustomerBean());
		return mv;
	}
	
	@RequestMapping(value="/addCustomer", method=RequestMethod.GET)
	public ModelAndView AddCustomer(@ModelAttribute("custBean")CustomerBean bean){
		ModelAndView mv=new ModelAndView();
		Integer id=service.addCust(bean);
		mv.setViewName("CreateSuccess");
		mv.addObject("id", id);
		return mv;
	}
	
	@RequestMapping(value="/LoadGetAllCustomer", method=RequestMethod.GET)
	public ModelAndView GetCustomerDetails(){
		ModelAndView mv=new ModelAndView();
		List<CustomerBean> list = service.getAllCustomers();
		mv.setViewName("GetAllCustomerDetails");
		mv.addObject("custList", list);
		return mv;
	}
}
