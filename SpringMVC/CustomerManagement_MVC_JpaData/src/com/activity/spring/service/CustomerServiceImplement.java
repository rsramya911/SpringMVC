package com.activity.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.activity.spring.bean.CustomerBean;
import com.activity.spring.dao.*;

@Service
public class CustomerServiceImplement implements CustomerService{
	@Autowired
	private CustomerDao dao;
	
	@Override
	public Integer addCust(CustomerBean bean) {
		return dao.addCust(bean);
	}

	@Override
	public List<CustomerBean> getAllCustomers() {
		return dao.getAllCustomers();
	}

}
