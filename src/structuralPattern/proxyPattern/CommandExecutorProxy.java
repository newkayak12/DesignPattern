package structuralPattern.proxyPattern;

public class CommandExecutorProxy implements CommandExcutor{
	private boolean isAdmin;
	private CommandExcutor excutor;
	public CommandExecutorProxy(String user, String pwd){
		if("kim".equals(user)&&"pwd".equals(pwd)){
			isAdmin = true;
		}
		excutor = new CommandExcutorImpl();
		
	}
	@Override
	public void runCommand(String cmd) throws Exception {
		if(isAdmin){
			excutor.runCommand(cmd);
		} else {
			if(cmd.trim().startsWith("rm")){
				throw new Exception("rm command is not allowed for non-admin user");
			}else{
				excutor.runCommand(cmd);
			}
		}
	}
	
}
