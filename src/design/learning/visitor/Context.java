package design.learning.visitor;

/**
 *  访问器 ， 被访问元素， 对象结构（存储元素） ， 
 *  访问器， 被访问元素互相依赖
 *  被访问元素增加， 访问器接口，实现类需要修改。
 *  对访问器扩展开放， 新增访问器非常方便。
 * @author panyl
 *
 */
public class Context {

	public static void main(String[] args) {
		/**
		 * 客人
		 */
		Customer peter = new Customer();
		/**
		 * 员工
		 */
		Staff lee = new Staff();
		
		/**
		 * 购物商城
		 */
		ShopMall mall = new ShopMall();
		
		/**
		 * peter 访问购物商城
		 */
		mall.accept(peter);
		mall.accept(lee);
	}
}
