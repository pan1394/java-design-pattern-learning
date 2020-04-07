package design.learning.factory;

public class Context {

	 public static void main(String[] args) {
		//static factory method
		Product p = StaticFactory.make();
		System.out.println(p.getName());
		
		//factory method pattern
		Factory factory = new CupFactory();
	    p = factory.createProduct();
		System.out.println(p.getName());
	 }

}
