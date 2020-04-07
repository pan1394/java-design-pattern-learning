package design.learning.iterator;

public class Context {

	public static void main(String[] args) {
		MyContainer<String> c = new MyContainer<>();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		c.add("e");
		
		Interator<String> it = c.getInterator();
		while(it.hasNext()) {
			System.out.print(it.next());
		}
		System.out.println();
		while(it.hasPre()) {
			System.out.print(it.pre());
		}
		
	}
}
