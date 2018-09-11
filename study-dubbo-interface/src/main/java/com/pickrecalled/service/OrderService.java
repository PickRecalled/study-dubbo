package com.pickrecalled.service;

import com.pickrecalled.model.UserAddress;

import java.util.List;

public interface OrderService {

	/**
	 * 初始化订单
	 * @param userId
	 */
	public List<UserAddress> initOrder(String userId);

}
