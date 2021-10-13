package behavioralPattern.templatePattern;

public class Soccer extends Game{

	@Override
	void initialize() {
		System.out.println("Soccer Game Initialized! Start playing");
	}

	@Override
	void start() {
		System.out.println("Game Started. Welcome to in the Soccer Game!");		
	}

	@Override
	void end() {
		System.out.println("Game Finished!");
	}
	
}
