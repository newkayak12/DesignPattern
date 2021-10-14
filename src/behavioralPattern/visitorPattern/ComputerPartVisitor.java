package behavioralPattern.visitorPattern;

import behavioralPattern.visitorPattern.concreteClass.Computer;
import behavioralPattern.visitorPattern.concreteClass.Keyboard;
import behavioralPattern.visitorPattern.concreteClass.Monitor;
import behavioralPattern.visitorPattern.concreteClass.Mouse;

public interface ComputerPartVisitor {
	//represent visitor
	
	public void visit(Computer computer);
	public void visit(Mouse mouse);
	public void visit(Keyboard keyboard);
	public void visit(Monitor monitor);
}
