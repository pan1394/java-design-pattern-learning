package design.learning.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象结构角色， 聚合了对象的所有元素。 
 * 可增减元素。 
 * 通过访问器可访问处理对象所有元素
 * @author panyl
 *
 */
public class ShopMall {

	/**
	 * 被访问元素容器。
	 */
	private static List<Place> places = new ArrayList<>();
	
	static {
		Place bathRoom = new BathRoom();
		places.add(bathRoom);
		Place store = new Store();
		places.add(store);
	}
	
	/**
	 * 访问器处理所有元素。
	 * @param visitor
	 */
	public void accept(Visitor visitor) {
		for(Place p : places) {
			p.accept(visitor);
		}
	}
}
