package com.activity.spring.entity;

import java.util.Date;

import javax.persistence.*;

@Entity
public class CustomerEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer custId;
	private String custName;
	@Temporal(TemporalType.DATE)
	private Date custDob;
	private String custLocation;
	private Double custSal;
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
	
	
}
