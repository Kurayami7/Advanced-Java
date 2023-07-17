package example1;

public class Sundae extends IceCream {

  private String name;
  private int iceCreamPrice;
  private String topping;
  private int price;

  public Sundae(String iceCream, int iceCreamPrice, String topping, int toppingPrice) {
    this.iceCreamPrice = iceCreamPrice;
    this.name = iceCream;
    this.price = toppingPrice;
    this.topping = topping;
  }

  @Override
  public int getCost() {
    // TODO Auto-generated method stub
    return price + iceCreamPrice;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getIceCreamPrice() {
    return iceCreamPrice;
  }

  public void setIceCreamPrice(int iceCreamPrice) {
    this.iceCreamPrice = iceCreamPrice;
  }

  public String getTopping() {
    return topping;
  }

  public void setTopping(String topping) {
    this.topping = topping;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  @Override
  public void whoAmI() {
    System.out.println("I am an icecream sundae");
  }

}
