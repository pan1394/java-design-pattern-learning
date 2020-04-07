package design.learning.proxy;

/**
 * target 对象， 被代理对象。
 * @author panyl
 *
 */
public class PeopleTalk implements ITalk {

	@Override
	public void talk() {
		System.out.println("people talks...");
	}

}
