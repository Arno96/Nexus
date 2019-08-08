package com.spring.Spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.carspr.Car2;
import com.engspr.Lambo;

public class InhMain {

	public static void main(String[] args) {
		 ApplicationContext ctx=new ClassPathXmlApplicationContext("spring2.xml");
	      Lambo obj= (Lambo)ctx.getBean("lamboObj");
	       System.out.println(obj);
	       Car2 obj1= (Car2)ctx.getBean("carObj1");
	       System.out.println(obj1);
	       Car2 obj2= (Car2)ctx.getBean("carObj");
	       System.out.println(obj2);


	}

}
