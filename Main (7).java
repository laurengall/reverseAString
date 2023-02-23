import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a word:");
    String str = input.nextLine();
    System.out.println("Type the number of the operation you would like to perform.");
    System.out.println("1. Reverse a string.");
    System.out.println("2. Remove all spaces.");
    System.out.println("3. Print in all uppercase letters.");
    System.out.println("4. Print in all lowercase letters.");
    int num = input.nextInt();

    if (num == 1) {
      reverse(str);
    } else if (num == 2) {
      noSpace(str);
    } else if (num == 3) {
      upperCase(str);
    } else if (num == 4) {
      lowerCase(str);
    }

  }

  public static void reverse(String str) {

    String newStr = "";
    for (int x = str.length() - 1; x > -1; x--) {
      newStr += str.charAt(x);
    }
    System.out.println(str + " in reverse is " + newStr);
  }

  public static void noSpace(String str) {

    String aStr = "";
    for (int x = 0; x < str.length(); x++) {
      aStr = str.replaceAll("\\s+", "");
    }
    System.out.println(str + " without the white space is " + aStr);
  }

  public static void upperCase(String str) {
    System.out.println(str.toUpperCase());
  }

  public static void lowerCase(String str) {
    System.out.println(str.toLowerCase());
  }
}