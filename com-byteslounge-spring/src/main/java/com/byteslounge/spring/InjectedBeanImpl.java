package com.byteslounge.spring;

import org.springframework.stereotype.Service;

@Service
public class InjectedBeanImpl implements InjectedBean {

	public void doSomething() {
		System.out.println("Bean was correctly injected!");
	}

}
