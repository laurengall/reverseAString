import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    boolean stop = false;
    Scanner input = new Scanner(System.in);
    while (stop == false) {
      System.out.println("Enter a word:");
      String str = input.nextLine();
      String backup = str;
      print();
      int num = input.nextInt();
      if (num == 1) {
        reverse(str);
      } else if (num == 2) {
        noSpace(str);
      } else if (num == 3) {
        upperCase(str);
      } else if (num == 4) {
        lowerCase(str);
      } else if (num == 5) {
        concat(str);
      } else if (num == 6) {
        palindrome(str);
      }
      System.out.println("Would you like to do another manipulation? Type 1 for yes and 2 for no.");
      int x = input.nextInt();
      if (x == 1) {
        System.out.println("Type 1 to reuse your last string, type 2 to use a new string.");
        int whichOne = input.nextInt();
        if (whichOne == 1) {
          sameStr(backup, str);
        } else if (whichOne == 2) {
          System.out.println("Enter a word:");
          str = input.nextLine();
          print();
        }

      } else if (x == 2) {
        stop = true;
        break;
      }
    }
  }

  public static void reverse(String str) {
    String newStr = "";
    for (int x = str.length() - 1; x > -1; x--) {
      newStr += str.charAt(x);
    }
    System.out.println(str + " in reverse is " + newStr);
  }

  public static String rev(String str) {
    String newStr = "";
    for (int x = str.length() - 1; x > -1; x--) {
      newStr += str.charAt(x);
    }
    return newStr;
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

  public static void concat(String str) {
    Scanner input2 = new Scanner(System.in);
    System.out.println("Type in the string you would like to concatenate with the first string.");
    String add = input2.nextLine();
    String newStr = str + add;
    System.out.println(str + " concatenated with " + add + " is " + newStr);
  }

  public static void palindrome(String str) {
    String check = rev(str);

    if (str.equals(check)) {
      System.out.println("Yes, this string is palindrome.");
    } else {
      System.out.println("No, this string is not a palindrome.");
    }
  }

  public static void sameStr(String backup, String str) {
    str = backup;
    print();
  }

  public static void print() {
    System.out.println("Type the number of the operation you would like to perform.");
    System.out.println("1. Reverse a string.");
    System.out.println("2. Remove all spaces.");
    System.out.println("3. Print in all uppercase letters.");
    System.out.println("4. Print in all lowercase letters.");
    System.out.println("5. Concatenate two strings.");
    System.out.println("6. Check if string is a palindrome.");
  }
}