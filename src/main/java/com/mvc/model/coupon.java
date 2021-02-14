package com.mvc.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class coupon {
	@Id
	private String couponCode;
	private int offPercent;
	public coupon() {
		super();
		// TODO Auto-generated constructor stub	
	}
	public coupon(String couponCode, int offPercent) {
		super();
		this.couponCode = couponCode;
		this.offPercent = offPercent;
	}
	public String getCouponCode() {
		return couponCode;
	}
	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}
	public int getOffPercent() {
		return offPercent;
	}
	public void setOffPercent(int offPercent) {
		this.offPercent = offPercent;
	}
	@Override
	public String toString() {
		return "coupon [couponCode=" + couponCode + ", offPercent=" + offPercent + "]";
	}
	
}
