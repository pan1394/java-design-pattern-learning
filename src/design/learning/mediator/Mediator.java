package design.learning.mediator;

/**
 * 中介者模式： 中心化组件， 使同事角色交互，通过使用中介者角色来完成。
 * 即同事角色和中介者互为依赖， 同事之间解耦。
 * 同事交互的业务逻辑由中介者来实现。
 * 交互的业务逻辑复杂， 则中介者的业务逻辑也会变得非常复杂。
 * @author panyl
 *
 */
public interface Mediator {

	/**
	 * 向指定数据库同步数据
	 * @param fromDatabase
	 * @param data
	 */
	public void sync(Database fromDatabase, String data);
	
	/**
	 * 注册各数据库
	 * @param db
	 */
	public void register(Database db);
}
