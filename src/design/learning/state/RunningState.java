package design.learning.state;

public class RunningState extends LiftState {

	@Override
	public void open() {
		// TODO Auto-generated method stub

	}

	@Override
	public void close() {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		System.out.println("Lift is running...");

	}

	@Override
	public void stop() {
		super.context.setState(LiftContext.STOPPED);
		super.context.stop();
	}

}
