package com.byteslounge.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExampleBean {

	@Autowired
	private InjectedBean injectedBean;
	
	public void callExampleMethod() {
		injectedBean.doSomething();
	}

}
