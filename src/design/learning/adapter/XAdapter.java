package design.learning.adapter;

public class XAdapter implements Adapter{

	private Adaptee adaptee;
	
	public XAdapter(Adaptee adaptee) {
		 this.adaptee = adaptee;
	}

	@Override
	public void display() {
		this.adaptee.draw();
	}
}
