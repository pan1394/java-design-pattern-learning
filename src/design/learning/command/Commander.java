package design.learning.command;

/**
 *   请求发布者， 依赖请求。
 * @author panyl
 *
 */
public class Commander {
	
	private HistoryCommands hist =  HistoryCommands.get();
	
	public void publish(ICommand command) {
		command.exec();
		/**
		 * 
		 * 备忘录模式， 
		 *  Commander对象为状态改变（请求）发起者。 
		 *  a.保存请求状态（clone方法） b. 到备忘录管理器中。
		 */
		hist.achive(((Command) command).clone());
	}
	
	/**
	 * undo 操作
	 */
	public void revert() {
		/**
		 * 返回备忘录容器中的上一步状态。
		 */
		ICommand command = hist.getPre();
		if(command == HistoryCommands.NoCommand) {
			command = hist.getLast();
		};
		command.exec();
		/**
		 * 重新归档历史记录
		 */
		hist.rollback(command);
	}
	
	/**
	 * 历史操作记录显示
	 */
	public void getCmdList() {
		System.out.println(hist.getList());
	}
}
