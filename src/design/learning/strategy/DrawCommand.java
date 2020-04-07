package design.learning.strategy;

/**
 * 具体的策略对象， 包含业务逻辑。
 * @author panyl
 *
 */
public class DrawCommand implements ICommand {

	@Override
	public void exec() {
		System.out.println("draw...");
	}

}
