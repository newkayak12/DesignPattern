package creationalPattern.factoryPattern.factory;

import creationalPattern.factoryPattern.subClass.PC;
import creationalPattern.factoryPattern.subClass.Server;
import creationalPattern.factoryPattern.superClass.Computer;

public class ComputerFactory {
    public static Computer getComputer(String type, String ram, String hdd, String cpu){
        if("PC".equalsIgnoreCase(type)){
            return new PC(ram,hdd,cpu);
        } else if("SERVER".equalsIgnoreCase(type)){
            return new Server(ram,hdd,cpu);
        }
// static 메소드로 구현되어있다.
//  각 클래스는 type에 따라서 인스턴스화된다.
//
//        팩토리 메소드 패턴을 사용하면 인스턴스를 필요로하는 애플리케이션에서 Computer의 sub 클래스에 대한 정보는 모른 채 인스턴스를 생성할 수 있다.
//        sub클래스를 추가하더라도 애플리케이션에서의 코드는 따로 수정할 필요가 없다.
//
//        1. factory class를 싱글톤으로 구현해도 되고, 서브클래스를 리턴하는 static 메소드로 구현해도 된다.
//        2. 팩토리 메소드는 입력된 파라미터에 따라 서브 클래스의 인스턴스를 생성하고 리턴한다.
        return null;
    }
}
