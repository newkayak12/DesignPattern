package creationalPattern.abstractFactoryPattern.test;


import creationalPattern.abstractFactoryPattern.consumerClass.ComputerFactory;
import creationalPattern.abstractFactoryPattern.subClassimpl.PCFactory;
import creationalPattern.abstractFactoryPattern.subClassimpl.ServerFactory;
import creationalPattern.abstractFactoryPattern.superClass.Computer;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        Computer pc  = ComputerFactory.getComputer(new PCFactory("2GB", "500GB", "3.1Ghz"));
        Computer server  = ComputerFactory.getComputer(new ServerFactory("16GB", "100TB", "5.1Ghz"));
        System.out.println("PC :: "+pc);
        System.out.println("server :: "+server);
    }
}
