package design.learning.visitor;

/**
 *   具体被访问元素角色。
 * @author panyl
 *
 */
public class Store implements Place {

	@Override
	public void accept(Visitor visitor) {
		/**
		 * 客户访问此商店
		 */
		visitor.visit(this);
	}

	/**
	 * callback方法， 在访问器对象中被调用， 用于检测访问器是否具有此元素的访问权限。
	 * @param visitor
	 */
	public void access(Visitor visitor) {
		if(visitor instanceof Customer) {
			System.out.println("Welcome, please shopping.");
		}else if(visitor instanceof Staff) {
			System.out.println("Hi, this is work time, go back to you position!");
		}
	}
}
