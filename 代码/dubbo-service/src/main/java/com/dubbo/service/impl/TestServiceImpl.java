package com.dubbo.service.impl;

import com.dubbo.service.TestService;

/**
 * service impl
 * @author hwy
 *
 */
public class TestServiceImpl implements TestService{

	public String sayHello(String name) {
		return name + " service2 say hello word service2!";
	}

}
