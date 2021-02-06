package com.hwangrq.spring.learn;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author hwangrq
 * @date 2021/2/7 2:37
 * @description
 */
public class MyBean implements InitializingBean, ApplicationContextAware {

	public MyBean() {
		System.out.println("MyBean 构造器...");
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("MyBean afterPropertiesSet...");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("MyBean setApplicationContext");
	}
}
