package design.learning.bridge;

public class Context {

	public static void main(String[] args) {
		/**
		 * 数据线， 连接手机端
		 */
		IComputerInterface wire1 = new MiDataWireAdapter(new MiPhone());
		Computer computer = new Computer();
		/**
		 * 电脑USB接口，连数据线
		 */
		computer.setInterface1(wire1);
		/**
		 * 电脑访问手机
		 */
		computer.connect();
		
		IComputerInterface wire2 = new HuaweiDataWireAdapter(new HuaWeiPhone());
		computer.setInterface1(wire2);
		computer.connect();
		
	}
}
