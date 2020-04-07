package design.learning.mediator;

/**
 * 同事角色。
 *   定义数据库基本功能
 * @author panyl
 *
 */
public interface Database {

	/**
	 * 向数据库插入一条数据
	 * @param data
	 */
	public void insert(String data);
	
	/**
	 * 将数据向其他数据库同步
	 * @param data
	 */
	public void sync(String data);
}
