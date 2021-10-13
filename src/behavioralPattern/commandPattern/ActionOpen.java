package behavioralPattern.commandPattern;

public class ActionOpen implements ActionListenerCommand {
//concrete command
	private Document doc;

	public ActionOpen(Document doc){
		this.doc = doc;
	}

	@Override
	public void execute() {
		doc.open();	
	}
	
}
