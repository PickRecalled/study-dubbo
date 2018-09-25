package com.pickrecalled.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.pickrecalled.model.UserAddress;
import com.pickrecalled.service.OrderService;
import com.pickrecalled.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * 1、将服务提供者注册到注册中心（暴露服务） 1）、导入dubbo依赖（2.6.2）\操作zookeeper的客户端(curator) 2）、配置服务提供者 2、让服务消费者去注册中心订阅服务提供者的服务地址
 */
@Service
public class OrderServiceImpl implements OrderService {

	@Autowired(required = false)
	UserService userService;

	@Override
	@HystrixCommand(fallbackMethod = "hystrixCommandMothod")
	public List<UserAddress> initOrder(String userId) {
		System.out.println("====initOrder====");
		// 如果有方法也会被容错
		// int i = 0, m = 3;
		// System.out.println("3/0=" + (3 / 0));
		System.out.println("用户id：" + userId);
		// 1、查询用户的收货地址
		List<UserAddress> addressList = userService.getUserAddressList(userId);
		for (UserAddress userAddress : addressList) {
			System.out.println(userAddress.getUserAddress());
		}
		return addressList;
	}

	// 容错后调用的方法
	public List<UserAddress> hystrixCommandMothod(String userId) {
		System.out.println("---hystrixCommandMothod---");
		return Arrays.asList(new UserAddress(1234567889, "渝北区13条路", "2345", "小磊", "12383xxxxx", "N"));
	}

}
