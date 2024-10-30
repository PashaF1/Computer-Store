public class StoreItem{

  private String nameOfProduct;
  protected double price;
  private int year;

   public StoreItem() {
        this.nameOfProduct = "No info";
        this.price = 0.0;
        this.year = 0;
    } 

  
  
  public StoreItem(String nameOfProduct, double price, int year){
    this.nameOfProduct = nameOfProduct;
    this.price = price;
    this.year = year;
  }

  
  // public String getNameOfProduct(){
  //   return nameOfProduct;
  // }
  // public double getPrice(){
  //   return price;
  // }
  // public int getYear(){
  //   return year;
  // }
  public String toString(){
    return "\nName of Product: " + nameOfProduct + "\nPrice: " + price + "\nYear: " + year;
  }
}
