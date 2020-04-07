package design.learning.command;


public abstract class Command implements ICommand, Cloneable {

	@Override
	protected Command clone(){
		try {
			return (Command) super.clone();
		}catch(CloneNotSupportedException ex) {
			System.out.println(ex);
			return null;
		}
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
}
