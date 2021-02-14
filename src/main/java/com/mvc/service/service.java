package com.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.dao.customerdao;
import com.mvc.model.customer;
@Service
public class service {
	@Autowired
	private customerdao customerdao;

	public customer Validate(String empNumber) {
		return this.customerdao.validateUser(empNumber);
	}

	
}
