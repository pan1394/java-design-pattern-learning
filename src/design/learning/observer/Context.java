package design.learning.observer;

public class Context {

	public static void main(String[] args) {
		/**
		 * 报纸
		 */
		NewsPaper news = new NewsPaper();
		
		/**
		 * 订阅报纸的路人1
		 */
		People p1 = new People(news, "Oh, my God!");
		
		/**
		 * 订阅报纸的路人2
		 */
		People p2 = new People(news, "Emm, good, War not Bread!");

		/**
		 * 新闻发布
		 */
		news.publish("War on England!!");
		news.publish("War Ended!");
	}
}
