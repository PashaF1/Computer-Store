import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    // Creates a Scanner object - feel free to delete if not using!
    Scanner input = new Scanner(System.in);



Computer two = new Computer();
    System.out.println(two);
    
  Laptop three = new Laptop();
    System.out.println(three);

  CustomComputer four = new CustomComputer(123, "intel core i9", "RTX4090", 32, 2);
    System.out.println(four);

  Keyboard five = new Keyboard();
    System.out.println(five);

    Mouse six = new Mouse();
    System.out.println(six);
    
 // Closes the Scanner object
    input.close();
  }
}
