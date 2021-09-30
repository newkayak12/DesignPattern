package creationalPattern.abstractFactoryPattern.abstractFactoryInterface;

import creationalPattern.abstractFactoryPattern.superClass.Computer;

public interface ComputerAbstractFactory {
    public Computer createComputer();
//   추상 팩토리 역할을 하는 인터페이스 또는 추상 클래스가 필요하다.

    /*
        팩토리 인터페이스를 구현하는 클래스에서 createComputer를 오버라이드 해서 각각의 서브클래스를 리턴할 것이다.
     */
}
