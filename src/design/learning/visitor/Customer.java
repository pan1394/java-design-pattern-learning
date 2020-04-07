package design.learning.visitor;

/**
 * 具体的访问器角色。 对元素有特定的访问权限和特定的处理逻辑。
 * @author panyl
 *
 */
public class Customer implements Visitor {

	/**
	 * 客户访问Store时， 会获得Store的回应。
	 */
	@Override
	public void visit(Store store) {
		/**
		 * 一次call back
		 */
		store.access(this);
	}

	/**
	 * 客户访问BathRoom时，会获得BathRoom对象， 并进行具体业务逻辑。
	 */
	@Override
	public void visit(BathRoom batchRoom) {
		System.out.println("you can rest here!");

	}

}
