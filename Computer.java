public class Computer extends StoreItem{

  protected String processor;
  protected String videoCard;
  protected int ram;
  protected int memory;

public Computer(){
  super("No info", 0.0, 0);
  this.processor = "No info";
  this.videoCard = "No info";
  this.ram = 0;
  this.memory = 0;
}



  public Computer(String nameOfProduct, double price, int year, String processor, String videoCard, int ram, int memory){
    super(nameOfProduct,price,year);
  this.processor = processor;
  this.videoCard = videoCard;
  this.ram = ram;
  this.memory = memory;
  }

  public String toString(){
  return "\nComputer: " + super.toString() + "\nProcessor: " + processor + "\nVideo card: " + videoCard + "\nRam: " + ram + "\nMemory" + memory;
  }
}
