package spring.kewei.pojo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {

	private String name;
	private Integer age;
	private Car car;
	
	private Object[] cars; // 数组类型注入
	private List list; //list 类型的注入
	private Set set; // set类型注入
	private Map map;
	private Properties properties;
	
	

	public Object[] getCars() {
		return cars;
	}

	public void setCars(Object[] cars) {
		this.cars = cars;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public Set getSet() {
		return set;
	}

	public void setSet(Set set) {
		this.set = set;
	}

	public Map getMap() {
		return map;
	}

	public void setMap(Map map) {
		this.map = map;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public Person(String name, Car car) {
		super();
		System.out.println("构造方法被调用");
		this.name = name;
		this.car = car;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Person(){
		super();
		System.out.println("构造方法被调用");
	}
	
	public void init(){
		System.out.println("Person被初始化");
	}
	
	public void destroy(){
		System.out.println("Person被销毁");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", car=" + car + ", cars=" + Arrays.toString(cars) + ", list="
				+ list + ", set=" + set + ", map=" + map + ", properties=" + properties + ", getCars()="
				+ Arrays.toString(getCars()) + ", getList()=" + getList() + ", getSet()=" + getSet() + ", getMap()="
				+ getMap() + ", getProperties()=" + getProperties() + ", getCar()=" + getCar() + ", getName()="
				+ getName() + ", getAge()=" + getAge() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}


	
	
	
	
}
