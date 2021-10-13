package behavioralPattern.mementoPattern;

public class MementoDemoClass {
	

	public static void main(String[] args) {
		Originator originator = new Originator();

		CareTaker careTaker = new CareTaker();

		originator.setState("STATE #1");
		careTaker.add(originator.saveStateToMemento());

		originator.setState("STATE #2");
		careTaker.add(originator.saveStateToMemento());

		originator.setState("STATE #3");
		careTaker.add(originator.saveStateToMemento());

		originator.setState("STATE #4");
		careTaker.add(originator.saveStateToMemento());



		System.out.println("Current State: "+originator.getState());
		originator.getStateFromMemento(careTaker.get(0));
		
		System.out.println("First saved State: "+originator.getState());
		originator.getStateFromMemento(careTaker.get(1));

		System.out.println("Second saved State: "+originator.getState());
		originator.getStateFromMemento(careTaker.get(2));

		System.out.println("Third saved State: "+originator.getState());
		originator.getStateFromMemento(careTaker.get(3));


		// 실제로는 스택으로 구현할 것 같다.
	
	}
}
