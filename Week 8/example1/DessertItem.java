package example1;

public class DessertItem {
  String name;

  public DessertItem(){
    name="dessert";
  }
  
  public DessertItem(String name){
    this.name=name;
  }
  
  public int getCost() {
    System.out.println("This method should be used to return the price of the element");
    return 0;
  }

  public void whoAmI(){
    System.out.println("I am a dessert item");
  }
}