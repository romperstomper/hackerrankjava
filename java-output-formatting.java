import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                String num = String.format("%03d", x);
                String line = String.format("%-14s %s", s1, num);
                System.out.println(line);
            }
            System.out.println("================================");

    }
}
