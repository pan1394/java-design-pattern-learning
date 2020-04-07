package design.learning.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体容器角色。
 * @author panyl
 *
 * @param <E>
 */
public class MyContainer<E> {

	private List<E> all = new ArrayList<>();
	
	public List<E> getAll() {
		return all;
	}
	
	public void add(E a) {
		all.add(a);
	}

	/**
	 * 通过构建的迭代器对象， 将遍历行为解耦。
	 * @return
	 */
	public Interator<E> getInterator(){
		return new MyInterator<E>(this);
	}
}
