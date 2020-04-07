package design.learning.command;

/**
 *   请求接受者，独立的个体， 业务逻辑和其他角色无关。 与请求发布者， 请求解耦。
 *   
 * @author panyl
 *
 */
public class Soldier {

	private String name;
	
	public Soldier(String name) {
		this.name = name;
	}
	
	public void shoot() {
		System.out.println("soldier "+name+" shoots...");
	}
	
	public void talk() {
		System.out.println("soldier "+name+" talks...");
	}
	
	public void run() {
		System.out.println("soldier "+name+" runs...");
	}
}
