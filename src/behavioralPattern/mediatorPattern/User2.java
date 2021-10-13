package behavioralPattern.mediatorPattern;

public class User2 extends Participant {

	private String name;
	private ChatRoom chat;


	@Override
	public void sendMsg(String msg) {
		chat.showMsg(msg, this);
		
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	public User2(ChatRoom chat ){
		this.chat = chat;
	}
}
