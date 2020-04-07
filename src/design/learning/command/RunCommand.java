package design.learning.command;

/**
 *    具体发送的请求。 依赖请求接受者。 
 *    当请求执行时， 由请求接受者来执行具体业务逻辑。
 * @author panyl
 *
 */
public class RunCommand extends Command {

	private Soldier s;
	public RunCommand(Soldier s) {
		this.s = s;
	}
	
	@Override
	public void exec() {
		 s.run();
	}

}
