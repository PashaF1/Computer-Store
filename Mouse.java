public class Mouse extends StoreItem{

private double responceSpeed;
private int extraButtons;

  public Mouse(){
    super("No info", 0.0, 0);
    this.responceSpeed = 0.0;
    this.extraButtons = 0;
  }

  public String toString(){
    return "\nMouse: " + super.toString() + "\nResponce Speed: " + responceSpeed + "\nExtra Buttons: " + extraButtons;
  }
  
}
