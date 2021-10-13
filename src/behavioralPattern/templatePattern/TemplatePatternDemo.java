package behavioralPattern.templatePattern;

public class TemplatePatternDemo {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		// Class c = Class.forName("Chess.java");
		// Game game = (Game) c.newInstance();
		// game.play();

		Game game = Chess.class.newInstance();
		// 리플렉션...
		game.play();
	}
}
