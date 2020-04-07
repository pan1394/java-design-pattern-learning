package design.learning.bridge;

/**
 *   桥接模式， 先有桥， 再在桥的基础上发展两端。
 *   桥的两端可以独立发展。  
 * @author panyl
 *
 */
public class Computer {

	/**
	 * 桥接， 也叫接口模式。
	 */
	private IComputerInterface interface1;

	public IComputerInterface getInterface1() {
		return interface1;
	}

	public void setInterface1(IComputerInterface interface1) {
		this.interface1 = interface1;
	}
	
	public void connect() {
		System.out.print("Computer is ");
		this.interface1.USB();
	}
	
}
