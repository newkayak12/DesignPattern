package structuralPattern.bridgePattern;

public abstract class Shape {
	
	protected Color color;

	public Shape(Color color){
		this.color = color;
	}

	abstract public void applyColor();
	//하위 클래스에 구현을 위임
}
