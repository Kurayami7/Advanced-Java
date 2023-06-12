public class Human {
  String name;
  int birthYear;
  int maxAge;

  double weight;
  double height;
  double calories;

  int currentYear;

  int age;

  double BMI;
  double heightSquared;

  double newBMI;

  public Human() {
    name = "no name";
    birthYear = 2000;
    maxAge = 100;
    calories = 4000;

    weight = 66;
    height = 1.7;
    calories = 0;

    currentYear = 2023;

    age = 0;

    BMI = 0;

    newBMI = 28;
  }

  public Human(String n, int b, int a) {
    name = n;
    birthYear = b;
    maxAge = a;
  }

  public void smoke(int numOfCigarettes) {

    maxAge -= 2 * numOfCigarettes;

  }

  public void exercise(int numOfHours) {
    maxAge += numOfHours / 300;

  }

  public void displayInfo() {
    System.out.println("Name:" + name);
    System.out.println("Year of birth:" + birthYear);
    System.out.println("Maximum age:" + maxAge);

  }

  public double eat(int calories) {
    if (calories >= 4000) {
      weight += 0.5;
    }
    return weight;
  }

  public double workOut(int calories) {
    if (calories >= 4000) {
      weight -= 0.2;
    }
    return weight;
  }

  public int findAge() {
    age = currentYear - birthYear;
    return age;
  }

  public void displayAge() {
    // Step 5:
    System.out.println("The age is: " + age);
  }

  public double calculateBMI() {
    heightSquared = height * height;
    BMI = weight / heightSquared;
    System.out.println("BMI: " + BMI);

    return BMI;
  }

  // Step 7:
  public void checkHealthStatus() {
    if (BMI < 25) {
      System.out.println("You are healthy!");
    } else {
      System.out.println("You are unhealthy");
    }
      System.out.println();
  }

  // Additional step:
  public void updateBMI() {
    System.out.println("Updated BMI: " + newBMI);
    if (newBMI < 25) {
      System.out.println("You are healthy!");
    } else {
      System.out.println("You are unhealthy!");
    }
  }
}