package design.learning.adapter;

public class Context {

	public static void main(String[] args) {
		
		Adaptee adaptee = new Adaptee();
		XAdapter x = new XAdapter(adaptee );
		x.display();
		
		YAdapter y = new YAdapter();
		y.display();
	}
}
