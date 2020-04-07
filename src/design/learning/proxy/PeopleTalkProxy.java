package design.learning.proxy;

/**
 * proxy对象， 依赖被代理target对象。
 * @author panyl
 *
 */
public class PeopleTalkProxy implements ITalk {

	/**
	 * 被代理对象
	 */
	private ITalk pt;
	
	public PeopleTalkProxy(ITalk pt) {
		this.pt = pt;
	}
	
	/**
	 * 被强化后的业务逻辑
	 */
	@Override
	public void talk() {
		pt.talk();
		System.out.println("and people dances...");
	}

}
