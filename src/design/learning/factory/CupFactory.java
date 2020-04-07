package design.learning.factory;

/**
 * 具体工厂， 生产具体的杯子的工厂 
 * @author panyl
 *
 */
public class CupFactory implements Factory {

	@Override
	public Product createProduct() {
		return new Cup("High Value Cup!");
	}

}
