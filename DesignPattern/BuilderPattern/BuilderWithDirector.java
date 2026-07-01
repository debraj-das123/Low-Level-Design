package DesignPattern.BuilderPattern;
//product 
 class Computer {

    private final String cpu;
    private final String ram;
    private final String ssd;
    private final String gpu;
    private final boolean wifi;
    private final boolean rgbKeyboard;
    private final boolean liquidCooling;

    public Computer(
            String cpu,
            String ram,
            String ssd,
            String gpu,
            boolean wifi,
            boolean rgbKeyboard,
            boolean liquidCooling) {

        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.gpu = gpu;
        this.wifi = wifi;
        this.rgbKeyboard = rgbKeyboard;
        this.liquidCooling = liquidCooling;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "\ncpu='" + cpu + '\'' +
                ",\nram='" + ram + '\'' +
                ",\nssd='" + ssd + '\'' +
                ",\ngpu='" + gpu + '\'' +
                ",\nwifi=" + wifi +
                ",\nrgbKeyboard=" + rgbKeyboard +
                ",\nliquidCooling=" + liquidCooling +
                "\n}";
    }
}

// builder interface
 interface ComputerBuilder{
  void buildCpu();
  void buildRam();
  void buildSsd();
  void buildGpu();
  void buildWifi();
  void buildRgbKeyboard();
  void buildLiquidCooling();
  Computer build();

}
// gaming builder
 class GamingBuilder implements ComputerBuilder{
    private  String cpu;
    private  String ram;
    private  String ssd;
    private  String gpu;
    private  boolean wifi;
    private  boolean rgbKeyboard;
    private  boolean liquidCooling;  

    public void buildCpu(){
      cpu = "Inter i9";
    }
    public void buildGpu(){
      gpu = "RTX 550";
    }

    public void buildRam(){
      ram = "16GB";
    }
    public void buildSsd(){
      ram = "2TB SSD";
    }

    public void buildWifi(){
      wifi = true;
    }
    public void buildRgbKeyboard(){
      rgbKeyboard = true;
    }
    public void buildLiquidCooling(){
      liquidCooling = true;  
    }

    public Computer build() {
        return new Computer(
                cpu,
                ram,
                ssd,
                gpu,
                wifi,
                rgbKeyboard,
                liquidCooling
        );
      }    
}

// office builder

 class officeBuilder implements ComputerBuilder{
    private  String cpu;
    private  String ram;
    private  String ssd;
    private  String gpu;
    private  boolean wifi;
    private  boolean rgbKeyboard;
    private  boolean liquidCooling;  

    public void buildCpu(){
      cpu = "Inter i9";
    }
    public void buildGpu(){
      gpu = "RTX 550";
    }

    public void buildRam(){
      ram = "16GB";
    }
    public void buildSsd(){
      ram = "2TB SSD";
    }

    public void buildWifi(){
      wifi = true;
    }
    public void buildRgbKeyboard(){
      rgbKeyboard = true;
    }
    public void buildLiquidCooling(){
      liquidCooling = true;  
    }

    public Computer build(){
      return new Computer(
        cpu, gpu, ram, ssd,  wifi, rgbKeyboard, liquidCooling
      );
    }
}
// Director

class ComputerDirector{
  public Computer construct(ComputerBuilder builder){
    builder.buildCpu();
    builder.buildRam();
    builder.buildSsd();
    builder.buildGpu();
    builder.buildWifi();
    builder.buildRgbKeyboard();
    builder.buildLiquidCooling();

    return builder.build();
  }
}

public class BuilderWithDirector {
  public static void main(String[] args) {
    ComputerDirector director = new ComputerDirector();
    GamingBuilder g = new GamingBuilder();
    officeBuilder o = new officeBuilder();

    Computer gamingPc = director.construct(g);
    Computer officePc = director.construct(o);

    System.out.println("------ gaming pc ----------------");
    System.out.println(gamingPc);

    System.out.println("------------office pc ------------");
    System.out.println(officePc);

  }
}
