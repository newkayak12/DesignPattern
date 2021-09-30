package creationalPattern.builder;

public class Computer {
    private String hdd;
    private String ram;

    private boolean isGraphicCardEnabled;
    private boolean isBluetoothEnabled;

    public String getHdd() {
        return hdd;
    }

    public String getRam() {
        return ram;
    }

    public boolean isGraphicCardEnabled() {
        return isGraphicCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    private Computer(ComputerBuilder builder) {
        this.hdd = builder.hdd;
        this.ram = builder.ram;
        this.isGraphicCardEnabled = builder.isGraphicCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }


    public static class ComputerBuilder{
        private String hdd;
        private String ram;


        private boolean isGraphicCardEnabled;
        private boolean isBluetoothEnabled;

        public ComputerBuilder() {
        }
        public ComputerBuilder builder(){
            return new ComputerBuilder();
        }

        public ComputerBuilder hdd(String hdd) {
            this.hdd = hdd;
            return this;
        }

        public ComputerBuilder ram(String ram) {
            this.ram = ram;
            return this;
        }

        public ComputerBuilder graphicCardEnabled(boolean graphicCardEnabled) {
            isGraphicCardEnabled = graphicCardEnabled;
            return this;
        }

        public ComputerBuilder bluetoothEnabled(boolean bluetoothEnabled) {
            isBluetoothEnabled = bluetoothEnabled;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    /*
        Computer 클래스는 Setter가 없이 Getter만 가지고 public 생성자가 없다.
        ComputerBuilder에 생성을 의존한다.
     */
}
        @Override
        public String toString() {
            return hdd+" : "+ram+" : "+isBluetoothEnabled+" : "+isGraphicCardEnabled;
        }
}
