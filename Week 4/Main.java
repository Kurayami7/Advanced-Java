import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    // Step 1
    ArrayList<String> namesList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    String input;
    int count = 1;

    System.out.println("Please enter your names: ");
    System.out.println("Enter quit if you'd like to quit");

    do {
      input = scanner.nextLine();
      if (!input.equalsIgnoreCase("quit")) {
        namesList.add(input);
      }
    }

    while (!input.equalsIgnoreCase("quit"));
    System.out.println("Exited sucessfully");

    for (String items : namesList) {
      System.out.println("Name " + count + ": " + items);
      count++;
    }

    // Step 3
    Random random = new Random();
    int randNum = random.nextInt(namesList.size());
    String winner = namesList.get(randNum);
    System.out.println("Congratulations!!! \nThe winner is: " + winner);

    // Step 4
    randNum = random.nextInt(namesList.size());
    System.out.println(namesList.size()); // Just checking if remove works
    String secondWinner = namesList.remove(randNum);
    System.out.println("Congratulations!!! \nThe winner is: " + secondWinner);
    System.out.println(namesList.size()); // Just checking if remove works as expected

    // I thought it would be boring to remove the winner after he/she wins. Why not
    // just use the remove method to remove them and store the name at the same
    // time, then just print out the stored variable

    // Step 5
    randNum = random.nextInt(namesList.size());
    String thirdButSecondWinner = namesList.remove(randNum);
    System.out.println("Congratulations!!! \nThe new winner is: " + thirdButSecondWinner);

    // Program 2:
    Animal fastestAnimal = null;
    double maxSpeed = 0;

    // Step 1
    ArrayList<Animal> landAnimals = new ArrayList<>();

    // Step 2
    Animal cheetah = new Animal();
    cheetah.setName("Cheetah");
    cheetah.setTopSpeed(70);

    Animal reindeer = new Animal();
    reindeer.setName("Reindeer");
    reindeer.setTopSpeed(29);

    Animal eagle = new Animal();
    eagle.setName("Eagle");
    eagle.setTopSpeed(69);

    Animal wolf = new Animal();
    wolf.setName("Wolf");
    wolf.setTopSpeed(55);

    // Step 3
    landAnimals.add(cheetah);
    landAnimals.add(reindeer);
    landAnimals.add(eagle);
    landAnimals.add(wolf);

    // Step 4 -- Using a regular for loop
    for (int i = 0; i < landAnimals.size(); i++) {
      Animal animalByIndex = landAnimals.get(i);
      System.out.println("Animal: " + animalByIndex.getName());
    }

    // Step 5
    for (Animal i : landAnimals) { // For each loop
      if (i.getTopSpeed() > maxSpeed) { // For each item/animal, get the top speed. If it's greater than a
                                        // holder-variable, the holder now stores the animal's top speed and the
                                        // fastestAnimal variable stores the index of that same animal simultaneously.
                                        // As the loop continues, the maxSpeed and fastestAnimal gets updated
                                        // dynamically.
        maxSpeed = i.getTopSpeed();
        fastestAnimal = i; // The fatest animal now becomes the index of whatever the current animal the
                           // loop is iterating through. It will simply become the fatest animal due to the
                           // if statement
      }
    }

    System.out.println("The fastest animal around is the " + fastestAnimal.getName());

  }
}
