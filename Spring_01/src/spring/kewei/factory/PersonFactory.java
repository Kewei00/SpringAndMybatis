package spring.kewei.factory;

import spring.kewei.pojo.Person;

public class PersonFactory {

	/**
	 * 调用第三方组件方法
	 * @return
	 */
	public static Person createPerson(){
		
		System.out.println("静态工厂创建Person");
		return new Person();
	}
	
	/**
	 * 实例工厂
	 * @return
	 */
	public  Person createPerson2(){
		
		System.out.println("实例工厂创建Person");
		return new Person();
	}					
}
