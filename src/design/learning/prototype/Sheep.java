package design.learning.prototype;

import java.util.Date;

public class Sheep extends Prototype {

	private String name;
	
	private Date birthDay;

	public Sheep(String name, Date birthDay) {
		this.name = name;
		this.birthDay = birthDay;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	

	
}
