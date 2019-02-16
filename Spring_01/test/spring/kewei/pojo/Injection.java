package spring.kewei.pojo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Injection {
	
	//属性注入
	@Test
	public void testproperty(){
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-Injection.xml");
		Person p = (Person) context.getBean("Person1");
		System.out.println(p);
	}

	//属性注入  构造方法注入  P名称空间注入
	@Test
	public void testConstructor(){
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-Injection.xml");
		Person p = (Person) context.getBean("person4");
		System.out.println(p);
	}
	
	
	//属性注入  复杂类型注入  数组  list set map 
	@Test
	public void testCollections(){
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-Injection.xml");
		Person p = (Person) context.getBean("person5");
		System.out.println(p);
	}
}
