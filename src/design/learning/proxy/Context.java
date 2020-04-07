package design.learning.proxy;

import java.lang.reflect.Proxy;

public class Context {

	public static void main(String[] args) {
		PeopleTalk pt = new PeopleTalk();
		PeopleTalkProxy proxy = new PeopleTalkProxy(pt);
		/**
		 * 调用代理对象方法。
		 */
		proxy.talk();
		
		/**
		 * 生成jdk dynamic proxy对象。
		 * 需要类加载器， 被代理target对象接口， 来生成proxy类对象。
		 * 需要InvocationHandler, 构建proxy对象时注入其构造器中，（proxy类，构造器中包含此InvocationHandler 类）
		 */
		ITalk proxyb = (ITalk) Proxy.newProxyInstance(Context.class.getClassLoader(), new Class[] {ITalk.class}, new PeopleTalkJDKDynamicProxy(pt));
		
		/**
		 * 调用代理对象方法。
		 */
		proxyb.talk();
	}
}
