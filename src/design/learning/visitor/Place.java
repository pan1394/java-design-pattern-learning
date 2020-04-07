package design.learning.visitor;

/**
 * 被访问元素角色
 * @author panyl
 *
 */
public interface Place {
	
	/**
	 * 接受访问器， 真实处理元素的是访问器。
	 * 通过访问器来对元素进行读写操作。
	 * @param visitor
	 */
	 public void accept(Visitor visitor);
}
