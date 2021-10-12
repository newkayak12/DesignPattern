package structuralPattern.proxyPattern;

public class CommandExcutorImpl implements CommandExcutor{

	@Override
	public void runCommand(String cmd) throws Exception {
		Runtime.getRuntime().exec(cmd);
		System.out.println("'"+cmd+"' command executed");
	}
	
}
