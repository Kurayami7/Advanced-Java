class Main {
  public static void main(String[] args) {
    // Create objects and do your testing here...
    Human James = new Human();
    James.smoke(5);
    James.displayInfo();

    System.out.println();
    System.out.println("****** ****** ****** ******");
    System.out.println();

    James.exercise(1250);
    James.displayInfo();
  }
}