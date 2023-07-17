import example1.*;
import example2.*;
import java.util.ArrayList;

class Example1 {
  public static void main(String[] args) {

    Cookie c = new Cookie("Chocolate chip", 3, 5);
    IceCream i = new IceCream("Cookie Dough", 5);
    Sundae s = new Sundae("Monster", 5, "M&M", 3);

    // Polymorphism - having multiple forms. It is capacity of the parent class to
    // act like any one of the child classes.
    // Ex: if you create a variable of DessertItem class, it can act like any of the
    // child class (i.e) Candy, Cooki, Icecream and Sundae.

    DessertItem d; // can act like any of the child class variable

    d = new DessertItem();
    d.whoAmI();

    d = new Cookie("Chocolate chip", 3, 5); // DessertItem d = new Cookie
    d.whoAmI();

    d = new IceCream("Cookie Dough", 5);
    d.whoAmI();

    System.out.println("******\n");
    ArrayList<DessertItem> dessertItems = new ArrayList<DessertItem>();
    dessertItems.add(i);
    dessertItems.add(c);
    dessertItems.add(s);

    for (DessertItem x : dessertItems) {
      x.whoAmI();
    }

  }
}