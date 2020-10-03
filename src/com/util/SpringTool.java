package com.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTool {
 //启动Spring的工具类
	private static String con_file="applicationContext.xml";
	private static ApplicationContext ctx;
	static {
		ctx=new ClassPathXmlApplicationContext(con_file);	
	}
	
	
	public static Object getBean(String beanId) {
		return ctx.getBean(beanId);
	}
}
