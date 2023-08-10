import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] names = { "Sohrab", "Juan", "Areaf", "Paulo", "Bernardo" };
    // try-catch for Exception Handling
    // wherever we expect error, wrap it around a try block

    // Array Index

    try {

      for (int i = 0; i <= 4; i++) {
        System.out.println(names[i]);
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println(e.getMessage());
    }

    // if the specific error is not known, e.exception can be used

    try {
      double a, b;
      System.out.println("Enter value for a:");
      a = scanner.nextDouble();

      System.out.println("Enter value for b:");
      b = scanner.nextDouble();
      double c = a / b;
      System.out.println("Reminder of division" + a / b);
    }

    catch (InputMismatchException e) {
      System.out.println("Input mismatch exception");
    }
    Car x;

    // Null pointer exception
    String name = null;

    try {
      if (name.equals("Piyush")) {
        System.out.println("Welcome");
      }

      else {
        System.out.println("Please try again later");
      }

    }

    catch (NullPointerException e) {
      System.out.println("Exception has been dealt with successfully. The string to compare is empty (null)");
    } catch (Exception e) { // Generic exception - A last resort safety measure
      System.out.println("Generic expression " + e.getMessage());
    }

    Car Honda = new Car("Honda", "Grey", 2019, "tucson", "suv");
    Honda.readMap1();
    try {
      Honda.readMap2();
    } catch (IOException e) {
      System.out.println(e.getMessage());
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    System.out.println("You've reached the end");

    try {
      Honda.accelerate();
    } catch (OverspeedingException e) {
      System.out.println(e.getMessage());
    }
  }

  /*
   * There are 2 types of exceptions
   * - Checked: Compile will warn, cannot proceed without try-catch block
   * - Unchecked: Can only be found at runtime, inputmismatch, nullPointer, etc
   */
}