package design.learning.command;

public class ShootCommand extends Command {

	private Soldier s;
	public ShootCommand(Soldier s) {
		this.s = s;
	}
	
	@Override
	public void exec() {
		 s.shoot();
	}

}
