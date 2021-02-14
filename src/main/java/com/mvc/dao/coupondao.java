package com.mvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.mvc.model.coupon;
import com.mvc.model.customer;
@Component
public class coupondao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public coupon validateUser(String couponId) {
		
		if(this.hibernateTemplate.get(coupon.class,couponId) != null) {
			return this.hibernateTemplate.get(coupon.class, couponId);
			}
	
		else {
			return null;
		}
	
					}

	
}
