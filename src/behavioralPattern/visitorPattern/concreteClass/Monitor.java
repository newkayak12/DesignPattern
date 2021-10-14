package behavioralPattern.visitorPattern.concreteClass;

import behavioralPattern.visitorPattern.ComputerPart;
import behavioralPattern.visitorPattern.ComputerPartVisitor;

public class Monitor implements ComputerPart {

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
		
	}
	
}
