package structuralPattern.adapterPattern;

public class Sockets {
	public Volt getVolt(){
		return new Volt(120);
	}
}
