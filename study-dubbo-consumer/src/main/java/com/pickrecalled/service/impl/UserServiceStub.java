package com.pickrecalled.service.impl;

import com.pickrecalled.model.UserAddress;
import com.pickrecalled.service.UserService;
import org.springframework.util.StringUtils;

import java.util.List;

public class UserServiceStub implements UserService {

	private final UserService userService;

	public UserServiceStub(UserService userService) {
		this.userService = userService;
	}

	@Override
	public List<UserAddress> getUserAddressList(String userId) {
		System.out.println("---UserServiceStub---");
		if (!StringUtils.isEmpty(userId)) {
			return userService.getUserAddressList(userId);

		}
		return null;
	}
}
