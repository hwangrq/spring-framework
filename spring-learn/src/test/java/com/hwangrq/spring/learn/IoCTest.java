package com.hwangrq.spring.learn;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hwangrq
 * @date 2021/2/7 2:28
 * @description
 */
public class IoCTest {

	@Test
	public void testIoC() {
		/*
		 * ApplicationContext 是容器的高级接口 BeanFactory(顶级容器/根容器)规范定义了容器的基础行为
		 * Spring应用上下文，官方称之为IoC容器
		 * 	容器是一组组件和过程的集合，包括BeanFactory、单例池、BeanPostProcessor等以及之间的协作
		 * Map是IoC容器中的一个成员，叫做单例池，singletonObject
		 */

		/*
		 * Ioc容器创建管理Bean对象的，Spring Bean是有生命周期的
		 * 构造器执行、初始化方法执行、Bean后置处理器的before/after方法：
		 * 			AbstractApplicationContext#refresh#finishBeanFactoryInitialization
		 * Bean工厂后置处理器初始化、方法执行：
		 * 			AbstractApplicationContext#refresh#invokeBeanFactoryPostProcessors
		 * Bean后置处理器初始化：
		 * 			AbstractApplicationContext#refresh#registerBeanPostProcessors
		 */
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		MyBean myBean = applicationContext.getBean(MyBean.class);
		System.out.println(myBean);
	}
}
