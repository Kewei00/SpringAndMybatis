package spring.kewei.pojo;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

// 创建容器
@RunWith(SpringJUnit4ClassRunner.class)
// 等同于  AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
@ContextConfiguration("classpath:applicationContext.xml")   //针对某个配置文件
public class RunWithTest {
	
	@Resource(name="person")
	private Person per;
	
	@Test
	public void testproperty(){
		
		System.out.println(per);
	}
	
	
}
