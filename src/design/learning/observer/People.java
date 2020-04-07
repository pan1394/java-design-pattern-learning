package design.learning.observer;

import java.util.Observable;
import java.util.Observer;

/**
 *   观察者(listener)
 * @author panyl
 *
 */
public class People implements Observer {

	/**
	 * 此人三观所产生的想法
	 */
	private String thoughts;
	
	public People(NewsPaper news, String thoughts) {
		this.thoughts = thoughts;
		/**
		 * 被注册， (此人订阅了某新闻报纸)
		 */
		news.addObserver(this);
	}
	
	/***
	 * 发布者(Subject)调用观察者的update方法。
	 * Param Observable : Subject发布者自身对象
	 * arg : 发布者发布参数。
	 */
	@Override
	public void update(Observable o, Object arg) {
		NewsPaper p = (NewsPaper)o;
		/**
		 * 一次call back (p.getLatestMessge())
		 */
		read(p.getLatestMessage());
	}
	
	public void read(String msg) {
		System.out.println(msg);
		react();
	}
	
	public void react() {
		System.out.println(thoughts);
	}

}
