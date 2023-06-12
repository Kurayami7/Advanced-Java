import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    // *** Important - Enter in one field at a time while testing ***

    // open clients.csv, output data to the file then close clients.csv
    try (Formatter output = new Formatter("clients.csv")) {
      Scanner input = new Scanner(System.in);
      System.out.printf("%s%n%s%n? ",
          "Enter full name, number, zipcode and province.",
          "Enter end-of-file indicator(Ctrl+D) to end input.");

      while (input.hasNextLine()) { // loop until end-of-file indicator
        String fn = input.nextLine();
        if (!input.hasNextLine())
          break;
        String number = input.nextLine(); // Left as a string since I'm having issues using the .matches for ints
        if (!input.hasNextLine())
          break;
        String zipCode = input.nextLine();
        String province = input.nextLine();

        if (fn.matches("[A-Z]([a-zA-Z])* [A-Z]([a-zA-Z])*") && number.matches("\\d{3}-\\d{3}-\\d{4}")
            && zipCode.matches("[A-Za-z]\\d[A-Za-z] \\d[A-Za-z]\\d")
            && province.matches("ON|BC|MB|NB|NT|SK|NS|NL|YT|AB|NU|PE|QC")) {
          // break;

          try {
            // System.out.println(fn + number + zipCode + province); Testing if validation
            // works
            // output new record to file; assumes valid input
            output.format("%s, %s, %s, %s%n", fn, number, zipCode, province);
            output.flush();
          }

          catch (NoSuchElementException elementException) {
            System.err.println("Invalid input. Please try again.");

          }
          System.out.print("? ");
          System.out.println("End of file reached");
        }
      }
    }

    catch (SecurityException | FileNotFoundException | FormatterClosedException e) {
      e.printStackTrace();
    }

    // open clients.csv, read its contents and close the file
    try (Scanner input = new Scanner(Paths.get("clients.csv")).useDelimiter(",\\s*")) { // The useDelimiter method was
                                                                                        // used to specify a customer
                                                                                        // delimiter, where the
                                                                                        // delimiter for the .csv file
                                                                                        // is actually a comma followed
                                                                                        // by a space
      System.out.printf("%-15s%-15s%-15s%-15s%n", "Full name",
          "Phone number", "Zip Code", "Province"); // I simply changed the 10s and other XXs to 15s

      /*
       * %s - String value
       * %d - Integer value
       * %f - Float value ;%.2f - float with 2 decimal places
       * %n - New line
       * %-10s - Take 10 spaces for the first string
       */

      // %s %-10s
      // 1000 1000______Taran

      // read record from file
      while (input.hasNext()) { // while there is more to read
        // display record contents
        System.out.printf("%-15s%-15s%-15s%-15s%n", input.next(),
            input.next(), input.next(), input.nextLine().trim()); /*
                                                                   * I'm using the next line and trimming it at the same
                                                                   * time because there's an error where I can only see
                                                                   * one person's info after entering it while reading
                                                                   * the file.
                                                                   */
      }
    } catch (IOException | NoSuchElementException | IllegalStateException e) {
      e.printStackTrace();
    }
  }
}

// Question(s): How do I remove the comma that appears before the province in
// the case of multiple people's information?