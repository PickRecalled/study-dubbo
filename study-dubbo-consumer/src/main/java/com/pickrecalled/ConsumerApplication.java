package com.pickrecalled;

import com.pickrecalled.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ConsumerApplication {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-consumer.xml");
		context.start();
		OrderService orderService = context.getBean(OrderService.class);
		orderService.initOrder("1");
		System.out.println("调用完成……");
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
