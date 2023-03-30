package com.amaris;

import com.amaris.test.AService;
import com.amaris.ClassPathXmlApplicationContext;
import org.junit.Test;

public class Test1 {
	@Test
	public void test1(){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		AService aService = (AService)ctx.getBean("aservice");
		aService.sayHello();
	}
}
