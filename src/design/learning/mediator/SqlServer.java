package design.learning.mediator;

public class SqlServer extends AbstractDatabase {

	public SqlServer(Mediator mediator) {
		super(mediator);
	}
 
	@Override
	public String toString() {
		return AbstractDatabase.SQLSERVER;
	}
}
