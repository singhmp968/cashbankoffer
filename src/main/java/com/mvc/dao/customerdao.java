package com.mvc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


import com.mvc.model.customer;



@Component
public class customerdao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	//create 
		@Transactional
		public void createProduct(customer customer) {
			this.hibernateTemplate.saveOrUpdate(customer);
		}
		
		//get all products
		public List<customer> getProducts(){
		List<customer> customer = this.hibernateTemplate.loadAll(customer.class);
		
		return customer;
		}
		
		//delete the single product
		@Transactional
		public void deleteProduct(int cid) {
			customer c = this.hibernateTemplate.load(customer.class, cid);
			this.hibernateTemplate.delete(c);
		}
		public customer getProduct(int cid)
		{
			return this.hibernateTemplate.get(customer.class, cid);
		}

		public customer validateUser(String customerId) {
			
			if(this.hibernateTemplate.get(customer.class,customerId) != null) {
				return this.hibernateTemplate.get(customer.class, customerId);
				}
		
			else {
				return null;
			}
		
						}

}
