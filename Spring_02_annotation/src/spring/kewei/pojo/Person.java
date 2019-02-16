package spring.kewei.pojo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


/*@Repository("person") // dao 层
@Service("person")   // service 层
@Controller("person") // controller层
*/
// @Component("person")   等同于配置文件的   <bean name="person" class="spring.kewei.pojo.Person"></bean> 
@Component("person")  // 默认类名 首字母小写  也可定义名字
@Scope(scopeName="singleton")
//@Scope(scopeName="prototype")
public class Person {

	@Value(value="Devin")
	private String name;
	@Value(value="18")
	private Integer age;
	
//	@Autowired  // 查找容器里面类型为 car 的对象
//	@Qualifier("car2")
	@Resource(name="car1")
	private Car car;

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	
	@PostConstruct
	public void init(){
		System.out.println("Person被初始化");
	}
	
	@PreDestroy
	public void destroy(){
		System.out.println("Person被销毁");
	}
	
	public String getName() {
		return name;
	}
	@Value(value="Devin")
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
		return "Person [name=" + name + ", age=" + age + ", car=" + car + "]";
	}






	
	
	
	
}
