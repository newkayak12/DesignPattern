package behavioralPattern.mementoPattern;

public class Originator {
	
	private String state;


	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Memento saveStateToMemento(){
		return new Memento(state);
	}

	public void getStateFromMemento(Memento Memento){
		state = Memento.getState();
	}
}
