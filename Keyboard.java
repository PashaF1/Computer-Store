public class Keyboard extends StoreItem{

private String sound;
private boolean numPad;

  public Keyboard(){
    super("No info", 0.0, 0);
    this.sound = "No info";
    this.numPad = true;
  }

  public String toString(){
   return "\nKeyboard: " + super.toString() + "\nSound: " + sound + "\nHas NumPad?: " + numPad;
 }
}
