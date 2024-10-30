public class Laptop extends Computer{

private double screenSize;
private double weight;


  public String toString(){
    return "\nLaptop:" + super.toString() + "\nScreen size: " + screenSize + "\nWeight: " + weight;
  }
  
}
