package design.learning.state;

public class StoppedState extends LiftState {

	@Override
	public void open() {
		super.context.setState(LiftContext.OPENNING);
		super.context.open();

	}

	@Override
	public void close() {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		super.context.setState(LiftContext.RUNNING);
		super.context.run();
	}

	@Override
	public void stop() {
		System.out.println("Lift is stopped.");
	}

}
