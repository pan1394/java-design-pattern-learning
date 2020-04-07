package design.learning.iterator;

/**
 * 具体迭代器
 * @author panyl
 *
 * @param <E>
 */
public class MyInterator<E>  implements Interator<E> {

	private MyContainer<E> container;
	
	/**
	 * 依赖容器对象， 需要操作容器对象来进行遍历行为
	 * @param container
	 */
	public MyInterator(MyContainer<E> container) {
		this.container = container;
	}
	
	private int index=-1;
	
	@Override
	public boolean hasNext() {
		index = index + 1;
		return index < container.getAll().size();
	}

	@Override
	public E next() {
		return container.getAll().get(index);
	}

	@Override
	public E pre() {
		return container.getAll().get(index) ;
	}

	@Override
	public boolean hasPre() {
		index = index -1;
		return index > -1;
	}

}
