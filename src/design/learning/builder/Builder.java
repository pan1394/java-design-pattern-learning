package design.learning.builder;

/**
 * 实际构建对象角色
 * @author panyl
 *
 */
public class Builder {

	private Product p = new Product();
	
	public void buildPart1() {
		p.setPart1("part1");
	}
	
	public void buildPart2() {
		p.setPart2("part2");
	}
	
	public Product retieve() {
		return p;
	}
}
