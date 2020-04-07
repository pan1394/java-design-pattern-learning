package design.learning.strategy;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 *    策略集合容器， 可增减策略， 可选择策略并执行。
 * @author panyl
 *
 */
public class CommandContext {

	/**
	 * 策略容器
	 */
	private static Map<Option, ICommand> map = new HashMap<>();
	
	static {
		map.put(Option.PRINT, new PrintCommand());
		map.put(Option.DRAW, new DrawCommand());
	}
	
	public CommandContext() {
		
	}

	/**
	 * 策略选择并执行。
	 * @param option
	 */
	public void exec(Option option) {
		ICommand command = map.get(option);
		if(Objects.nonNull(command)) {
			command.exec();
		}else {
			System.out.println("Do Nothing.");
		}
	}
	
	public static enum Option{
		ERROR,
		PRINT,
		DRAW;
	}
	
	/**
	 *    使用策略模式简化 if ..., else ...
	 *    根据请求， 在策略容器中选择合适策略，并执行。 
	 * @param args
	 */
	public static void main(String[] args) {
		CommandContext context = new CommandContext();
		Option[] requests = new Option[] {Option.DRAW, Option.PRINT, Option.PRINT, Option.ERROR};
		for(Option req : requests) {
			context.exec(req);
		}
	}
}
