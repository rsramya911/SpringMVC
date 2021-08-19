package com.activity.spring.bean;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class CustomerBean {
	private Integer custId;
	private String custName;
	private Date custDob;
	private String custLocation;
	private Double custSal;
	
	public CustomerBean(){}
	public CustomerBean(Integer custId, String custName, Date custDob,
			String custLocation, Double custSal) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custDob = custDob;
		this.custLocation = custLocation;
		this.custSal = custSal;
	}
	
	public Integer getCustId() {
		return custId;
	}
	public void setCustId(Integer custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public Date getCustDob() {
		return custDob;
	}
	public void setCustDob(Date custDob) {
		this.custDob = custDob;
	}
	public String getCustLocation() {
		return custLocation;
	}
	public void setCustLocation(String custLocation) {
		this.custLocation = custLocation;
	}
	public Double getCustSal() {
		return custSal;
	}
	public void setCustSal(Double custSal) {
		this.custSal = custSal;
	}

	@Override
	public String toString() {
		return "CustomerBean [custId=" + custId + ", custName=" + custName
				+ ", custDob=" + custDob + ", custLocation=" + custLocation
				+ ", custSal=" + custSal + "]";
	}
	
}
