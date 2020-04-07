package design.learning.bridge;

/**
 *   适配器模式， 先有两端，然后可以使用适配器。
 *   为设备添加适配器， 使其获得连接电脑USB的兼容性。   
 * @author panyl
 *
 */
public class HuaweiDataWireAdapter implements IComputerInterface {

	/**
	 * 华为手机
	 */
	private HuaWeiPhone phone;
	
	public HuaweiDataWireAdapter(HuaWeiPhone phone) {
		this.phone = phone;
	}
	
	/**
	 * 华为手机USB接口
	*/
	@Override
	public void USB() {
		System.out.print(" using HuaWei Data wire to access ");
		this.phone.interface2();
	}

}
