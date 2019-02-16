package spring.kewei.pojo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IOCTest {
	
	@Test
	public void testBean(){
		// 读取 spring 配置文件  创建容器
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//查找对象
		Person P = (Person)context.getBean("p");
		System.out.println(P);
	}
	
	@Test
	public void testFactory(){
		// 读取 spring 配置文件  创建容器  默认特性，容器创建即调用了构造方法 默认为单例
		ApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\kewei\\workspace\\Spring_01\\src\\applicationContext.xml");
		//查找对象
		Person P1 = (Person)context.getBean("p1");
		Person P2 = (Person)context.getBean("p1");
		// scope="singleton" 时(默认为 singleton)， 值为 true;   scope="prototype" 为 false
		System.out.println(P1 == P2);
	}
	
	@Test
	public void testInitAndDestroy(){
		// 读取 spring 配置文件  创建容器  默认特性，容器创建即调用了构造方法 默认为单例
		AbstractApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\kewei\\workspace\\Spring_01\\src\\applicationContext.xml");
		// 主动调用 destroy 方法执行销毁
//		context.destroy();
		// 或者调用close 方法，触发销毁
		context.close();
		
	}

	
	@Test
	public void testStaticFactory(){
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Person p = (Person)context.getBean("Person1");
		System.out.println();
	}
	
	
	@Test
	public void testStaticFactory2(){
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Person p = (Person)context.getBean("Person1");
		System.out.println();
	}
}
