package behavioralPattern.strategyPattern;

import java.io.BufferedReader;
import java.io.IOException;


public class StrategyPatternDemo {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));

		System.out.println("enter the first Value: ");
		float value1 = Float.parseFloat(br.readLine());

		System.out.println("enter the second Value: ");
		float value2 = Float.parseFloat(br.readLine());

		Context context = new Context(new Addition());
		System.out.println("Addition : " + context.executeStrategy(value1, value2));;

		context = new Context(new Substraction());
		System.out.println("Substraction : " + context.executeStrategy(value1, value2));;

		context = new Context(new Multiplication());
		System.out.println("Multiplication : " + context.executeStrategy(value1, value2));;

		context = new Context(new Division());
		System.out.println("Division : " + context.executeStrategy(value1, value2));;
	}
}
