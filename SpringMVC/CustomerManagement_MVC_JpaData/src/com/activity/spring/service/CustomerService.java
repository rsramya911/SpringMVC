package com.activity.spring.service;

import java.util.List;

import com.activity.spring.bean.CustomerBean;

public interface CustomerService {
	public Integer addCust(CustomerBean bean);
	public List<CustomerBean> getAllCustomers();
}
