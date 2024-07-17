package Day1Problem;

import java.util.Scanner;

public class SumOfFibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int user = input.nextInt();
        int first= 0;
        int end = 1;
        int third = 0;
        int sum = 1;
        for(int i=2;i<user;i++){
            third = first+end;
            sum = sum+third;
            first = end;
            end = third;
        }
        System.out.println(sum);
    }
}
