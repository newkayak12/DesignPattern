package behavioralPattern.visitorPattern;

public interface ComputerPart {
	//represent element
	
	public void accept(ComputerPartVisitor computerPartVisitor);
	
}
