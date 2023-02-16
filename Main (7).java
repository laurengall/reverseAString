import java.util.Scanner; 
class Main {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in); 
    System.out.println("Enter a word:"); 
    String str = input.nextLine(); 
    reverse(str); 
  }
  public static void reverse (String str) {
    String newStr = ""; 
    for (int x = str.length() - 1; x > -1; x--){
   newStr += str.charAt(x); 
    }
    System.out.println(newStr); 
  }
  
}