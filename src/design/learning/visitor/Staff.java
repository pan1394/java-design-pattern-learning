package design.learning.visitor;

public class Staff implements Visitor {

	@Override
	public void visit(Store store) {
		store.access(this);
	}

	@Override
	public void visit(BathRoom batchRoom) {
		System.out.println("clean...");
	}

}
