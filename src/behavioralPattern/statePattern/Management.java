package behavioralPattern.statePattern;

public class Management implements Connection{

	@Override
	public void open() {
		System.out.println("open database for Management");
	}

	@Override
	public void close() {
		System.out.println("close the database");
	}

	@Override
	public void log() {
		System.out.println("log activates");
	}

	@Override
	public void update() {
		System.out.println("Management hasn been updated");
	}
	
	
}
