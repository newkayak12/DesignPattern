package behavioralPattern.visitorPattern;

import creationalPattern.builder.Computer;

public class VisitorPatternDemo {
	public static void main(String[] args) {
		ComputerPart computer =new behavioralPattern.visitorPattern.concreteClass.Computer();
		computer.accept(new ComputerPartDisplayVisitor());
	}
	
}
