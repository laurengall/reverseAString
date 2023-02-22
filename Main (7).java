import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a word:");
    String str = input.nextLine();
    System.out.println("What operation would you like to perform?\n1. Reverse a String\n2. Remove spaces");
    int num = input.nextInt();

    if (num == 1) {
      reverse(str);
    } else if (num == 2) {

      noSpace(str);
    } else {

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
}