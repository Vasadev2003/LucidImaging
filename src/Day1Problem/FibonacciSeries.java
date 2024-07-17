package Day1Problem;
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int first = 0;
        int second  =1;
        System.out.print(first+" "+second+" ");
       for(int i=2;i<size;i++){

           int third = first+second;
           first = second;
           second = third;
           System.out.print(third+" ");
       }
    }
}
