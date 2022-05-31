package com.byteslounge.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
    	ExampleBean exampleBean = (ExampleBean) ctx.getBean("exampleBean");
    	exampleBean.callExampleMethod();
    }
}
