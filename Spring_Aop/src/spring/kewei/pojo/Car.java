package spring.kewei.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("car")
public class Car {
	
	@Value("haha")
	private String name;
	
	@Value("red")
	private String color;
	
	public Car(){
		super();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + "]";
	}
	
	
	
	

}