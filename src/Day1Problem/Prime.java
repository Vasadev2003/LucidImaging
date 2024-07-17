package Day1Problem;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int use = input.nextInt();
        int count = 0;
        for(int i=1;i<=use;i++){
            if(use%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Yes it is prime");
        }
        else{
            System.out.println("It is not prime");
        }

    }
}
