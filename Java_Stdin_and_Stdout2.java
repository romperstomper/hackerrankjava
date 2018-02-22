import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String i = scan.nextLine();
        String numstring = scan.nextLine();
        double d = Double.parseDouble(numstring);        
        String s = scan.nextLine();
        scan.close();
        

        // Write your code here.
  
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
