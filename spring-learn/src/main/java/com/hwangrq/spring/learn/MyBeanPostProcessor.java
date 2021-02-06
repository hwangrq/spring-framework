package com.hwangrq.spring.learn;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author hwangrq
 * @date 2021/2/7 2:38
 * @description Bean后置处理器
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

	public MyBeanPostProcessor() {
		System.out.println("BeanPostProcessor实现类 构造器...");
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if ("myBean".equalsIgnoreCase(beanName)) {
			System.out.println("BeanPostProcessor实现类 postProcess[Before]Initialization()方法调用中....");
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if ("myBean".equalsIgnoreCase(beanName)) {
			System.out.println("BeanPostProcessor实现类 postProcess[After]Initialization()方法调用中....");
		}
		return bean;
	}
}
