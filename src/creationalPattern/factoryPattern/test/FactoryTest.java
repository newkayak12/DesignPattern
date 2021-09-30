package creationalPattern.factoryPattern.test;

import creationalPattern.factoryPattern.factory.ComputerFactory;
import creationalPattern.factoryPattern.superClass.Computer;

public class FactoryTest {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc","16 GB","2tb", "5.1 Ghz");
        Computer server = ComputerFactory.getComputer("server", "64 GB", "256TB", "5.1 Ghz");

        System.out.println("PC ::"+pc);
        System.out.println("SERVER ::"+server);
    }
}
