package Day1Problem;

import java.util.Scanner;

public class ArmsStrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int count = 0;
        int temp = num;
        int armStrong =0;
        //count the digits
        while(temp>0){
            temp = temp/10;
            count++;
        }
        //last digit
        temp = num;
        while(temp>0){
            int last = temp%10;
            armStrong = (int)(armStrong+Math.pow(last,count));
            temp = temp/10;
        }
  // verifying
        if(armStrong==num){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }


    }
}
