package design.learning.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * InvocationHandler对象， 依赖target被代理对象。
 *   之后生成的proxy对象， 强化逻辑在invoke方法实现。
 * @author panyl
 *
 */
public class PeopleTalkJDKDynamicProxy implements InvocationHandler {

	/**
	 * 被代理target对象。
	 */
	private ITalk pt;
	
	public PeopleTalkJDKDynamicProxy(ITalk pt) {
		this.pt = pt;
	}
	
	/**
	 *     有jdk生产的proxy类对象， 继承java.reflect.proxy, 实现target对象的接口。
	 *     在构造proxy对象的时候， 会将InvocationHandler对象作为构造器参数来生成proxy实例。
	 *     之后，在proxy对象调用强化方法时， 此方法被执行。    
	 * -》 class $proxy0 extends proxy implements ITalk {
	 * 	   ...
	 * 	   private InvocationHandler h;
	 * 
	 * 	   private Method method;
	 *     ...
	 *     
	 *     public void talk(){
	 *        h.invoke(proxy, method, args);
	 *     }
	 * }
	 *   其中proxy实现的target对象接口方法,  并会调用此方法来强化target对象。
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object ret = method.invoke(pt, args);
		System.out.println("and people laughs...");
		return ret;
	}

}
