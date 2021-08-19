package com.activity.spring.dao;

import java.util.List;

import com.activity.spring.bean.CustomerBean;

public interface CustomerDao{

	public Integer addCust(CustomerBean bean);
	public List<CustomerBean> getAllCustomers();
}
