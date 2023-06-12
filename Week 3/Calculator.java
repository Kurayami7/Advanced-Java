public class Calculator {
  public static float performCalculation(float firstFloat, float secondFloat, String operation) { // It's returning
                                                                                                  // something, a
                                                                                                  // double. It has
                                                                                                  // parameters

    // It's a confusing question. "If this function is called with 2.5 , 4.5 and "-"
    // , the method should return -2.5". Does this mean hard coding, or is it an
    // example? Also why return -2.5 if it's an example, it's -2... I simply went
    // with what I understood best, which is an example

    if (operation == "+") {
      return firstFloat - secondFloat;
    }

    else if (operation == "+") {
      return firstFloat + secondFloat;
    }

    else if (operation == "avg") {
      return ((firstFloat + secondFloat) / 2);
    }

    else {
      return 0; // Default value in case the user is a troll
    }
  }

  public static void performCalculation2(float firstFloat, float secondFloat, String operation) {
    float result;
    switch (operation) {
      case "-":
        result = firstFloat - secondFloat;
        System.out.println(result);
        break;
      case "+":
        result = firstFloat + secondFloat;
        System.out.println(result);
        break;
      case "avg":
        result = (firstFloat + secondFloat) / 2;
        System.out.println(result);
        break;
      default:
        System.out.println("Invalid entries");
    }
  }
}