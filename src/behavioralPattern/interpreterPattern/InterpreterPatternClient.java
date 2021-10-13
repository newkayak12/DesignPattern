package behavioralPattern.interpreterPattern;

public class InterpreterPatternClient {
	public static void main(String[] args) {
		String infix = "a+b*c";

		InfixToPostfixPattern ip = new InfixToPostfixPattern();

		String postfix = ip.conversion(infix);
		System.out.println("infix "+ infix);
		System.out.println("postfix "+ postfix);
	}
}
