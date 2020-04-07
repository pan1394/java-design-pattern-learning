package design.learning.visitor;

/**
 * 具体被访问元素角色。业务逻辑并不在此类中进行， 而是依赖于具体的访问器对象。
 * @author panyl
 *
 */
public class BathRoom implements Place {

	@Override
	public void accept(Visitor visitor) {
		
		/**
		 * 对BathRoom的业务处理， 有具体访问者来处理。
		 * 比如访问者是客户， 则可以用来洗手， 上厕所。
		 *比如访问者是员工， 则可以进行打扫卫生， 并上厕所。
		 */
		visitor.visit(this);
	}

}
