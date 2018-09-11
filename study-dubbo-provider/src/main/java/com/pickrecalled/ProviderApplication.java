package com.pickrecalled;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ProviderApplication {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-provider.xml");
		context.start();
		try {
			System.in.read(); // 按任意键退出
		} catch (IOException e) {
			e.printStackTrace();

		}
	}
}
