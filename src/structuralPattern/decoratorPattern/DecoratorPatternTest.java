package structuralPattern.decoratorPattern;

public class DecoratorPatternTest {
	public static void main(String[] args) {
		Car sportsCar = new SportsCar(new BasicCar());

		sportsCar.assemble();
		System.out.println("\n************");

		Car sportsLuxarayCar = new SportsCar(new LuxuryCar(new BasicCar()));
		sportsLuxarayCar.assemble();
	}	
}
