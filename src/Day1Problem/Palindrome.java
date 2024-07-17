package Day1Problem;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int temp = num;
        int rev = 0;
        //rev
        while(num>0){
            int last  = num%10;
            rev = rev*10+last;
            num = num/10;
        }

        if(temp==rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not A Palindrome");
        }
    }
}
