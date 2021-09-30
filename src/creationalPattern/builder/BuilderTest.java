package creationalPattern.builder;


public class BuilderTest {
    public static void main(String[] args) {
        Computer computer =  new Computer.ComputerBuilder().hdd("500GB").ram("16GB").graphicCardEnabled(true).bluetoothEnabled(true).build();
        // lombok 처럼 new를 뺼 수 있는 방법이.. 
        System.out.println(computer.toString());
    }

}
