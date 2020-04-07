package design.learning.builder;

public class Context {

	public static void main(String[] args) {
		Builder builder = new Builder();
		Director director = new Director();
		Product p = director.getProduct(builder);
		System.out.println(p.getPart1());
		
		User u = User.getUserBuilder().setAge(2).setId(1).build();
		System.out.println(u.getAge());
	}
}
