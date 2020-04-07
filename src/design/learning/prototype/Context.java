package design.learning.prototype;

import java.util.Date;

public class Context {

	public static void main(String[] args) {
		Sheep sheep = new Sheep("Ally", new Date());
		Sheep dolly = (Sheep) sheep.clone();
		System.out.println(sheep.getBirthDay() == dolly.getBirthDay());
		System.out.println(sheep.getName() == dolly.getName());
		System.out.println(dolly.getName());
		System.out.println(dolly.getBirthDay());
	}

}
