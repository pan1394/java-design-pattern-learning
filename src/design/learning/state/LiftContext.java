package design.learning.state;

/**
 * 状态上下文角色， 真实执行对象行为逻辑的类。
 * 状态上下文和状态互为依赖。
 * @author panyl
 *
 */
public class LiftContext {

	/**
	 * 枚举各状态。
	 */
	public static LiftState OPENNING = new OpenningState();
	public static LiftState CLOSED = new ClosedState();
	public static LiftState RUNNING = new RunningState();
	public static LiftState STOPPED = new StoppedState();
	
	/**
	 * 状态上下文依赖状态对象
	 */
	private LiftState state;

	public LiftState getState() {
		return state;
	}

	
	public void setState(LiftState state) {
		this.state = state;
		/**
		 * 状态对象依赖上下文对象。
		 */
		this.state.setContext(this);
	}
	
	public void open() {
		this.state.open();
	}
	
	public void close() {
		this.state.close();
	}
	
	public void run() {
		this.state.run();
	}
	
	public void stop() {
		this.state.stop();
	}
}
