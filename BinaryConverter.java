
/**
 * Kaitlyn Woodworth
 * Start Date: August 11, 2023
 * last updated: August 14, 2023
 * 
 * Purpose: An easily implemented conversion of binary to english and english to binary, for encoding and decoding purposes.
 */

import java.util.*;

public class BinaryConverter {
  public static void main(String args[]) {

    Scanner in = new Scanner(System.in);

    // prompt the user to give input, and store that input into a string
    System.out.println(
        "Welcome, user! Print your desired binary or English string: \nPlease note: If one of your binary bytes or characters does not exist, it will be ignored.");
    String str = in.nextLine();

    // create an object of the HashMapConverter class, and create a hashmap calling
    // the object
    HashmapConverter classObj = new HashmapConverter();
    HashMap<String, String> valueHolder = classObj.getBinConvert();

    // set the output string to empty, it will be filled depending on the input
    String conversion = "";

    // set a boolean to false, it will only be utilized if the user broke their
    // binary string down properly (8 bit sections)
    boolean haveSpace = false;

    // check if the user spaced binary into sections
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == ' ') {
        haveSpace = true;
      }
    }

    // if the user gives a string divided by each byte of binary, wanting to decode
    // to English...
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

    // if the user did not break binary into given spaces of 8 bits...
    else if (!haveSpace && str.charAt(0) == '0' || str.charAt(0) == '1') {

      // utilise regular expression to divde each byte of binary, than get the key
      // value that matches each section to store into the output string
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

    // else if user gives an English string for encoding to binary...
    else {
      // break down string by each word (anytime theres a space) and get the binary
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