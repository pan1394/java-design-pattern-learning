package design.learning.visitor;

/**
 * 访问器模式
 * 抽象访问器角色： 访问对象的所有元素Element. 对象元素发生变化时， 此接口也会修改，并影响到其实现的子类。违反开闭原则(注意)。
 * @author panyl
 *
 */
public interface Visitor {

	/**
	 * 访问具体的对象元素(违法开闭）
	 *访问器读写Store对象 
	 * @param store
	 */
	 public void visit(Store store);
	 
	 /**
	  * 访问器读写BathRoom对象。
	  * @param batchRoom
	  */
	 public void visit(BathRoom batchRoom);

}
