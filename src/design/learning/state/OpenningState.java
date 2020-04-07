package design.learning.state;

public class OpenningState extends LiftState {

	@Override
	public void open() {
		System.out.println("Lift is opened.");
		
	}

	@Override
	public void close() {
		super.context.setState(LiftContext.CLOSED);
		super.context.close();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
	}

	
}
