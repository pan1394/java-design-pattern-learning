package design.learning.command;

public class Context {

	public static void main(String[] args) {
		//receiver
		Soldier lee = new Soldier("lee");
		Soldier jack = new Soldier("jack");
		
		//request
		ICommand runCommand = new RunCommand(lee);
		ICommand talkCommand = new TalkCommand(jack);
		ICommand shootCommand = new ShootCommand(lee);
		
		//request sent by client
		Commander commander = new Commander();
		commander.publish(runCommand);
		commander.publish(talkCommand);
		commander.publish(shootCommand);
		//history list
		commander.getCmdList();
		//undo
		commander.revert();
		commander.getCmdList();
		commander.revert();
		commander.getCmdList();
		commander.revert();
		commander.getCmdList();
	}
}
