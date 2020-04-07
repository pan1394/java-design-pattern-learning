package design.learning.mediator;

/**
 * Mysql数据库， 同事角色。
 * @author panyl
 *
 */
public class Mysql extends AbstractDatabase {

	public Mysql(Mediator mediator) {
		super(mediator);
	}

	@Override
	public String toString() {
		return AbstractDatabase.MYSQL;
	}
}
