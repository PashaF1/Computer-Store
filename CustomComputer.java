public class CustomComputer extends Computer{

public CustomComputer(double price, String processor, String videoCard, int ram, int memory){
  this.price = price;
  this.processor = processor;
  this.videoCard = videoCard;
  this.ram = ram;
  this.memory = memory;
  }
  
public void setPrice(double newPrice){  
  price = newPrice;
}  
  
public void setProcessor(String newProcessor){
  processor = newProcessor;
}  
  
public void setVideoCard(String newVideoCard){
  videoCard = newVideoCard;
}
  
public void setRam(int newRam){
  ram = newRam;
}
  
public void setMemory(int newMemory){
  memory = newMemory;
}

  
public String toString(){
  return "\nYour Custom Computer: " + "\nPrice: " + price + "\nProcessor: " + processor + "\nVideoCard: " + videoCard + "\nRAM: " + ram + "\nMemory: " + memory;
}



  
}
