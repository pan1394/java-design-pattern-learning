package design.learning.factory;

/**
 * 具体产品
 * @author panyl
 *
 */
public class Cup implements Product {

	private String name;
	
	public Cup(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

}
