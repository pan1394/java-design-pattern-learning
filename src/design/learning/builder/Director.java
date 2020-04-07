package design.learning.builder;

/**
 * 决定如何构建对象
 * @author panyl
 *
 */
public class Director {

	public Product getProduct(Builder builder) {
		builder.buildPart2();
		builder.buildPart1();
		return builder.retieve();
	}
}
