package design.learning.mediator;

public class Redis extends AbstractDatabase {

	public Redis(Mediator mediator) {
		super(mediator);
	}
 
	@Override
	public String toString() {
		return AbstractDatabase.REDIS;
	}
}
