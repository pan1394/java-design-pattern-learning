package design.learning.state;

/**
 * 对象有多个状态， 状态之间可以互相转换， 状态转化会引起对象行为发生变化。 
 * 状态模式，将对象的状态分离出来。有效减少if... else ...
 * 
 * 抽象状态角色
 *  包含 1个状态上下文容器， 通过Context来调用对象状态变化引起的行为。
 *  定义了对象的行为逻辑， 具体状态对象定义各种状态下对应行为逻辑。
 * @author panyl
 *
 */
public abstract class LiftState {

	/**
	 * 状态上下文， 对象行为实际执行者
	 */
	protected LiftContext context;
 
	public void setContext(LiftContext context) {
		this.context = context;
	}

	/**
	 * 电梯对象行为
	 */
	public abstract void open();
	
	public abstract void close();
	
	public abstract void run();
	
	public abstract void stop();
	
}
