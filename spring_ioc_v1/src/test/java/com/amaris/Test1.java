package com.amaris;


import com.amaris.beans.BeanException;
import com.amaris.context.ClassPathXmlApplicationContext;
import com.amaris.test.AService;
import org.junit.Test;

public class Test1 {

	@Test
	public void test1() throws BeanException {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		AService aService = (AService)ctx.getBean("aservice");
		aService.sayHello();
	}


}
