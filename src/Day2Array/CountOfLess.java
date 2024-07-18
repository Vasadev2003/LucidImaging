package Day2Array;

import java.util.Arrays;
import java.util.Scanner;

public class CountOfLess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int arr[] = new int[size];

        int count = 0;
        for(int i=0;i<size;i++){
            arr[i] = input.nextInt();
        }
        //
        int key = input.nextInt() ;
        for(int i=0;i<size;i++){
            if(arr[i]<key){
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(count);
    }
}
