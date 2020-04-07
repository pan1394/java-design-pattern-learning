package design.learning.observer;

import java.util.Observable;

/**
 *    具体的发布者或Subject. 可以被观察(Observable)
 *    具有发布Subject，消息的能力。 同时通知所有被观察者或(listener)   
 * @author panyl
 *
 */
public class NewsPaper extends Observable {

	private String message;
	
	public String getLatestMessage() {
		return message;
	}
	
	/**
	 *    内部属性变化， 发布消息
	 * @param message
	 */
	public void publish(String message) {
		this.message = message;
		this.setChanged();
		/**
		 * 通知观察者。
		 */
		this.notifyObservers();
	}
	
}
