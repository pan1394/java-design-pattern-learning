package design.learning.state;

public class Client {

	public static void main(String[] args) {
		LiftContext context = new LiftContext();
		context.setState(LiftContext.CLOSED);
		context.open();
		context.close();
		context.run();
		context.stop();
		context.open();
		context.run();
		
		
	}
}
