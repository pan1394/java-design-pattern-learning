package design.learning.state;

/**
 *   具体状态角色
 * 
 *  关门状态
 * @author panyl
 *
 */
public class ClosedState extends LiftState {

	/**
	 * 电梯开门行为
	 */
	@Override
	public void open() {
		/**
		 * 上下文重新设置为开门状态。
		 * 开门状态获取到新的上下文super.context;
		 */
		super.context.setState(LiftContext.OPENNING);
		/**
		 * 上下文执行行为-》 开门状态的开门方法。
		 */
		super.context.open();
	}

	@Override
	public void close() {
		System.out.println("Lift is closed.");
	}

	/**
	 * 上行， 下行行为。
	 */
	@Override
	public void run() {
		super.context.setState(LiftContext.RUNNING);
		super.context.run();
		
	}

	/*
	 * 停楼行为
	 */
	@Override
	public void stop() {
		// TODO Auto-generated method stub
	}

	
}
