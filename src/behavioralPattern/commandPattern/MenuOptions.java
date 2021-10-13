package behavioralPattern.commandPattern;

import javax.swing.Action;

public class MenuOptions {
	//invoker
	private ActionListenerCommand openCommand;
	private ActionListenerCommand saveCommand;

	public MenuOptions(ActionListenerCommand open, ActionListenerCommand save){
		this.openCommand = open;
		this.saveCommand = save;
	}

	public void clickOpen(){openCommand.execute();}
	public void clickSave(){saveCommand.execute();}
}
