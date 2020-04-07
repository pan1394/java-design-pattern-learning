package design.learning.command;

import java.util.ArrayList;
import java.util.List;

/**
 *   备忘录模式： 备忘录管理角色
 *   
 *   历史命令
 * @author panyl
 *
 */
public class HistoryCommands {

	
	private static HistoryCommands instance = new HistoryCommands();
	public static ICommand NoCommand = new NoCommand();
	
	private HistoryCommands(){
		
	}
	
	public static HistoryCommands get() {
		return instance;
	}
	
	/**
	 *  备忘录容器
	 */
	List<ICommand> histories = new ArrayList<>();

	public ICommand getLast() {
		return getLast(histories);
	}
	
	private ICommand getLast(List<ICommand> lst) {
		int size = lst.size();
		if(size > 0) {
			return lst.get(size-1);
		}
		return NoCommand;
	}
	
	/**
	 * 获取上一对象状态
	 * @return
	 */
	public ICommand getPre() {
		List<ICommand> lst = getPreList();
		ICommand command = NoCommand;
		if(lst !=null && lst.size() > 0) {
			command = getLast(lst);
		}
		return command;
	}
	
	/**
	 * 回滚至某状态点(save point).
	 */
	public void rollback(ICommand command) {
		histories = histories.subList(0, histories.indexOf(command));
		achive(command);
	}
 
	private List<ICommand> getPreList(){
		if(getSize() > 1) {
			return histories.subList(0, getSize()-1); 
		}
		return new ArrayList<>();
	}
	
	
	public List<ICommand> getList(){
		return histories;
	}
	
	
	public int getSize() {
		return histories.size();
	}
	
	public void achive(ICommand command) {
		histories.add(command);
	}
}
