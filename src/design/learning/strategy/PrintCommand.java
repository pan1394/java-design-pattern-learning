package design.learning.strategy;

public class PrintCommand implements ICommand {

	@Override
	public void exec() {
		System.out.println("print...");
	}

}
