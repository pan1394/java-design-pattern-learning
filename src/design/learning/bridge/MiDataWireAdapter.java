package design.learning.bridge;

public class MiDataWireAdapter implements IComputerInterface {

	private MiPhone phone;
	
	public MiDataWireAdapter(MiPhone phone) {
		this.phone = phone;
	}
	@Override
	public void USB() {
		 System.out.print(" using Mi Data wire to access ");
		 phone.interface1();
	}

}
