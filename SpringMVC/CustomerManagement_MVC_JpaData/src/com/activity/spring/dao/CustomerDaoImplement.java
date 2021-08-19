package com.activity.spring.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.activity.spring.bean.CustomerBean;
import com.activity.spring.entity.CustomerEntity;

@Transactional("txManager")
@Repository
public class CustomerDaoImplement implements CustomerDao{

	@PersistenceContext
	private EntityManager em;
	
	public Integer addCust(CustomerBean bean){
		CustomerEntity entity=new CustomerEntity();
		BeanUtils.copyProperties(bean, entity);
		em.persist(entity);
		Integer id=entity.getCustId();
		return id;
	}
	public List<CustomerBean> getAllCustomers(){
		Query query=em.createQuery("select e from CustomerEntity e");
		List<CustomerEntity> listEntities = (List<CustomerEntity>)query.getResultList();
		List<CustomerBean> listBean = new ArrayList<>();
		for(CustomerEntity entity:listEntities) {
			CustomerBean bean = new CustomerBean();
			BeanUtils.copyProperties(entity, bean);
			listBean.add(bean);
		}
		return listBean;
	}
}
