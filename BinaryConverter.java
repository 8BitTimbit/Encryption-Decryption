
/**
 * Kaitlyn Woodworth
 * Start Date: August 11, 2023
 * last updated: August 14, 2023
 * 
 * Purpose: A project that gives an easily implemented conversion of binary to english and english to binary, for encoding and decoding purposes. 
 */

import java.util.*;

public class BinaryConverter {
  public static void main(String args[]) {

    Scanner in = new Scanner(System.in);

    // prompt the user to give input, and store that input into a string
    System.out.println("Welcome, user! Print you desired binary or english string: ");
    String str = in.nextLine();

    // create an object of the HashMapConverter class, and create a hashmap calling
    // the object
    HashmapConverter classObj = new HashmapConverter();
    HashMap<String, String> valueHolder = classObj.getBinConvert();

    // set the output string to empty, it will be filled depending on input
    String conversion = "";

    // set a boolean to false, it will only be utilized if the user broke their
    // binary string down properly
    boolean haveSpace = false;

    // check if user spaced binary into sections
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == ' ') {
        haveSpace = true;
      }
    }

    // if a user gives a string divided by each byte of binary, wanting to decode to
    // english...
    if (haveSpace && str.charAt(0) == '0' || str.charAt(0) == '1') {
      // breaking down the string by spaces, than get the key value that matches each
      // section to store into the output string
      String[] userArr = str.split(" ");

      for (int i = 0; i < userArr.length; i++) {
        for (Map.Entry<String, String> check : valueHolder.entrySet()) {

          if (userArr[i].equals(check.getValue())) {
            conversion += check.getKey();
            break;
          }
        }
      }

    }

    // if user did not break binary into given spaces of 8 bits...
    else if (!haveSpace && str.charAt(0) == '0' || str.charAt(0) == '1') {

      // utilise regular expression to divde each byte of binary (8 bits), than get
      // the key value that matches each section to store into the output string
      String[] divided = str.split("(?<=\\G.{8})");

      for (int i = 0; i < divided.length; i++) {
        for (Map.Entry<String, String> check : valueHolder.entrySet()) {

          if (divided[i].equals(check.getValue())) {
            conversion += check.getKey();
            break;
          }
        }
      }

    }

    // else if user gives english string for encoding to binary...
    else {
      // break down by each word (anytime theres a space) and get the binary
      // equivilant to store into the output string
      String[] userArr = str.split("");

      for (int i = 0; i < userArr.length; i++) {
        conversion += " " + valueHolder.get(userArr[i]);
      }
    }

    // print the users desired output
    System.out.println(conversion);

  }
}