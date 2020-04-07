package design.learning.command;

public class TalkCommand extends Command {

	private Soldier s;
	public TalkCommand(Soldier s) {
		this.s = s;
	}
	
	@Override
	public void exec() {
		 s.talk();
	}

}
