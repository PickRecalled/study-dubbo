package com.pickrecalled.controller;

import com.pickrecalled.model.UserAddress;
import com.pickrecalled.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

	@Autowired
	OrderService orderService;

	@RequestMapping("/initOrder")
	public List<UserAddress> initOrder(@RequestParam("userId") String userId) {
        System.out.println("-----controller----");
		return orderService.initOrder(userId);
	}
}
