package design.learning.mediator;

public class Context {

	public static void main(String[] args) {
		/**
		 * 中介者
		 */
		Mediator syncMediator = new SyncMediator();
		
		/**
		 * 同事角色， 构造时同时将自己向中介者注册
		 */
		Database mysql = new Mysql(syncMediator);
		Database redis = new Redis(syncMediator);
		Database sqlserver = new SqlServer(syncMediator);
		
		/**
		 * 数据库插入数据， 同时使用依赖的中介者对数据向其他数据库进行同步操作。
		 */
		mysql.sync("1");
		redis.sync("2");
		sqlserver.sync("3");
	}
}
