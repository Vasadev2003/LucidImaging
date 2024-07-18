package Day2Array;

import java.util.Scanner;

public class ZerosOnes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int arr[] = new int[size];
        int zero = 0;
        int one = 0;

        for(int i=0;i<size;i++){
            arr[i] = input.nextInt();
        }
        for(int i=0;i<size;i++){
            if(arr[i]==0){
                zero++;
            }
            if(arr[i]==1){
                one++;
            }
        }
        System.out.println("No of Zeros = "+zero);
        System.out.println("No of Ones = "+one);
    }


}
