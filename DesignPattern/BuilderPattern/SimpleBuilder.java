package DesignPattern.BuilderPattern;

public class SimpleBuilder {

    public static void main(String[] args) {

        // Gaming PC
        Computer gamingPc = new Computer.Builder("Intel i9", "32GB")
                .ssd("2TB SSD")
                .gpu("RTX 5090")
                .wifi(true)
                .rgbKeyboard(true)
                .liquidCooling(true)
                .build();

        // Office PC
        Computer officePc = new Computer.Builder("Intel i5", "8GB")
                .ssd("512GB SSD")
                .wifi(true)
                .build();

        System.out.println("===== Gaming PC =====");
        System.out.println(gamingPc);

        System.out.println();

        System.out.println("===== Office PC =====");
        System.out.println(officePc);
    }
}

class Computer {

    private String cpu;
    private String ram;
    private String ssd;
    private String gpu;
    private boolean wifi;
    private boolean rgbKeyboard;
    private boolean liquidCooling;

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.ssd = builder.ssd;
        this.gpu = builder.gpu;
        this.wifi = builder.wifi;
        this.rgbKeyboard = builder.rgbKeyboard;
        this.liquidCooling = builder.liquidCooling;
    }

    public static class Builder {

        // Required Fields
        private String cpu;
        private String ram;

        // Optional Fields
        private String ssd;
        private String gpu;
        private boolean wifi;
        private boolean rgbKeyboard;
        private boolean liquidCooling;

        public Builder(String cpu, String ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        public Builder ssd(String ssd) {
            this.ssd = ssd;
            return this;
        }

        public Builder gpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public Builder wifi(boolean wifi) {
            this.wifi = wifi;
            return this;
        }

        public Builder rgbKeyboard(boolean rgbKeyboard) {
            this.rgbKeyboard = rgbKeyboard;
            return this;
        }

        public Builder liquidCooling(boolean liquidCooling) {
            this.liquidCooling = liquidCooling;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer {" +
                "\n  CPU = '" + cpu + '\'' +
                ",\n  RAM = '" + ram + '\'' +
                ",\n  SSD = '" + ssd + '\'' +
                ",\n  GPU = '" + gpu + '\'' +
                ",\n  WiFi = " + wifi +
                ",\n  RGB Keyboard = " + rgbKeyboard +
                ",\n  Liquid Cooling = " + liquidCooling +
                "\n}";
    }
}