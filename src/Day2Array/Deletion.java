package Day2Array;

import java.util.Arrays;
import java.util.Scanner;

public class Deletion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int arr[]= new int[size];
        int newArr[] = new int[size-1];

        for(int i=0;i<size;i++){
            arr[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        int pop = input.nextInt();

        //
        for(int i=0;i<pop;i++){
            newArr[i]=arr[i];
        }

        for(int i=pop;i<size-1;i++){
            newArr[i] = arr[i+1];
        }


        System.out.println(Arrays.toString(newArr));
    }
}
