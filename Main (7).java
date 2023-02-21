import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("What operation would you like to perform?\n1. Reverse a String\n2. Remove spaces");
    int num = input.nextInt();
    System.out.println("Enter a word:");
    String str = input.nextLine();

  }

  public static void reverse(String str) {
    String newStr = "";
    for (int x = str.length() - 1; x > -1; x--) {
      newStr += str.charAt(x);
    }
    System.out.println(newStr);
  }

}