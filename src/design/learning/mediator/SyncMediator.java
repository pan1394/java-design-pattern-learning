package design.learning.mediator;

import java.util.HashMap;
import java.util.Map;
/**
 * 具体中介者
 * @author panyl
 *
 */
public class SyncMediator implements Mediator {

	private static Map<String, Database> map = new HashMap<>();
	 
	/**
	 * 同事之间交互有中介者实现业务。
	 * 数据库同步业务逻辑。
	 */
	private void sync(String fromDatabase, String data) {
		if(AbstractDatabase.MYSQL.equals(fromDatabase)) {
			insert(AbstractDatabase.REDIS, data);
			insert(AbstractDatabase.SQLSERVER, data);
		}else if(AbstractDatabase.REDIS.equals(fromDatabase)) {
			 ;
		}else if(AbstractDatabase.SQLSERVER.equals(fromDatabase)) {
			insert(AbstractDatabase.MYSQL, data);
		}
	}

	public void sync(Database from, String data) {
		sync(from.toString(), data);
	}
	
	private void insert(String database, String data) {
		System.out.print(String.format("Database [%s] 接受同步数据：%s，  ", database, data));
		map.get(database).insert(data);
	}

	/**
	 * 将数据库注册。
	 */
	@Override
	public void register(Database db) {
		map.put(db.toString(), db);
	}
}
