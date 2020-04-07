package design.learning.iterator;

/**
 *    迭代器模式， 将容器遍历元素的行为从容器中分离出来, 重新封装为迭代器对象。
 * @author panyl
 *
 * @param <E>
 */
public interface Interator<E> {

	public boolean hasNext();
	
	public boolean hasPre();
	
	public E next();
	
	public E pre();
}
