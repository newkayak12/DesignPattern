package behavioralPattern.mediatorPattern;

public class MediatorPatternDemo {
	
	public static void main(String[] args) {
		ChatRoom chat = new ChatRoomImpl();

		User1 u1 = new User1(chat);
		u1.setName("user1");
		u1.sendMsg("hello!");

		User2 u2 = new User2(chat);
		u2.setName("user2");
		u2.sendMsg("hi?!");
	}
}
