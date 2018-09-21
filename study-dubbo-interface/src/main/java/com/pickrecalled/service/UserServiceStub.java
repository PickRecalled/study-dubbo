package com.pickrecalled.service;

import com.pickrecalled.model.UserAddress;

import java.util.List;

public class UserServiceStub implements UserService {

	private final UserService userService;

	public UserServiceStub(UserService userService) {
		this.userService = userService;
	}

	@Override
	public List<UserAddress> getUserAddressList(String userId) {
		System.out.println("---UserServiceStub---");
		if (null != userId && !"".equals(userId)) {
			return userService.getUserAddressList(userId);
		}
		return null;
	}
}
