package com.pickrecalled.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.pickrecalled.model.UserAddress;
import com.pickrecalled.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class NewUserServiceImpl implements UserService {

	@Override
	@HystrixCommand
	public List<UserAddress> getUserAddressList(String userId) {
		System.out.println("UserServiceImpl.....new....");
		UserAddress address1 = new UserAddress(1, "北京市昌平区宏福科技园综合楼3层", "1", "李老师", "010-56253825", "Y");
		UserAddress address2 = new UserAddress(2, "深圳市宝安区西部硅谷大厦B座3层（深圳分校）", "1", "王老师", "010-56253825", "N");
		if (Math.random() > 0.5) {
            System.out.println("------模拟方法抛出异常------");
			throw new RuntimeException("------模拟方法抛出异常------");
		}
		// try {
		// Thread.sleep(2000);
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }
		return Arrays.asList(address1, address2);
	}

}
