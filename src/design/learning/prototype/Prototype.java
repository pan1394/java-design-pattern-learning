package design.learning.prototype;

public class Prototype implements Cloneable{

	@Override
	protected Prototype clone() {
		Prototype prototype = null;
		try {
			prototype = (Prototype) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return prototype;
	}
}
