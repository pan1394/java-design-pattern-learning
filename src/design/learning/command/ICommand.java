package design.learning.command;


/*
 * 
 * 使命令 发布人和执行人 解耦 
 * 1. undo 操作 2.命令队列 3.历史记录
 * 
 * 
 */
public interface ICommand {

	public void exec();
}
