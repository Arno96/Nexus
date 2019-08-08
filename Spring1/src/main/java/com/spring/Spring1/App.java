package com.spring.Spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.carspr.Car;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
      Car obj= (Car)ctx.getBean("carObj");
       System.out.println(obj);
    }
}
