package behavioralPattern.commandPattern;

public class ActionSave implements ActionListenerCommand{
	//concreteCommand
	private Document doc;

	public ActionSave(Document doc){
		this.doc = doc;
	}

	@Override
	public void execute() {
		doc.save();
	}
	
}
