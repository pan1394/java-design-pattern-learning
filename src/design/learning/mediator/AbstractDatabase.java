package design.learning.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象数据库
 * @author panyl
 *
 */
public abstract class AbstractDatabase implements Database{

	public static final String MYSQL="mysql";
	public static final String REDIS="redis";
	public static final String SQLSERVER="sqlserver";
	
	/**
	 * 中介者
	 */
	protected Mediator mediator;
	
	/**
	 * 数据容器
	 */
	private List<String> dataset = new ArrayList<>();
	
	public AbstractDatabase(Mediator mediator) {
		this.mediator = mediator;
		/**
		 * 中介者注册数据库
		 */
		mediator.register(this);
	}
	
	/**
	 * 数据库插入数据
	 */
	@Override
	public void insert(String data) {
		this.dataset.add(data);
		System.out.println(String.format("Database [%s]添加了一条数据: %s", this.toString(), data));
	}
	
	/**
	 *插入数据时， 同时同步其他数据库
	 * 同步操作有中介者来执行。
	 */
	@Override
	public void sync(String data) {
		this.insert(data);
		mediator.sync(this, data);
	}
}
