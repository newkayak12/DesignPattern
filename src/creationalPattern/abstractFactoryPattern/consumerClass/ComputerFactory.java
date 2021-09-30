package creationalPattern.abstractFactoryPattern.consumerClass;

import creationalPattern.abstractFactoryPattern.abstractFactoryInterface.ComputerAbstractFactory;
import creationalPattern.abstractFactoryPattern.superClass.Computer;

public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }

}
