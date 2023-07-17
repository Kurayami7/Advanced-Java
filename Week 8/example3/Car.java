package example3;

// Derived Class Car
public class Car extends Vehicle  implements Loan {

  @Override
  public void payMortgage() {
    System.out.println("I promise to cover all my loans at " + interestRate);
  }
  
  // Private field
  private String bodyStyle;

  // Parameterized Constructor
  public Car(String make, String color, int year, String model, String bodyStyle) {
    super(make, color, year, model); // calling parent class constructor
    this.bodyStyle = bodyStyle;
  }

  public void carDetails() { // details of car
    printDetails(); // calling method from parent class
    System.out.println("Body Style: " + bodyStyle);
  }
  

}