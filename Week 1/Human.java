public class Human {
  String name;
  int birthYear;
  int maxAge;

  public Human() {
    name = "No Name";
    birthYear = 2000;
    maxAge = 100;
  }

  public Human(String name, int birthYear, int maxAge) {
    this.name = name;
    this.birthYear = birthYear;
    this.maxAge = maxAge;
  }

  public void smoke(int numOfCigarettes) {
    for (int i = 0; i < numOfCigarettes; i++) {
      maxAge -= 2;
    } /* The issue with this is that the maxAge continues to decrease incrementally even with decimal values as the arguments, but that can be fixed using typecasting and separating the numOfCigars as a whole number and a floating number (by subtracting the whole num from the numOfCigars)
     return maxAge; I wanted to return it but noticed there's a void */
  }

  public void exercise(int numOfHours) {
    for (int i = 0; i < numOfHours; i += numOfHours) {
      int lifespanIncrease = numOfHours / 300;
      maxAge += lifespanIncrease;
    }
  }

  public void displayInfo() {
    System.out
        .println("Greetings, " + name + ". You were born in " + birthYear + " and will live till you are " + maxAge);
  }
}