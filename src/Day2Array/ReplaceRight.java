package Day2Array;

import java.util.Arrays;
import java.util.Scanner;

public class ReplaceRight {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        int size = input.nextInt();
        int arr[] = new int[size];

        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }

        //
        for(int i=0;i<size;i++){
            int count =0;
            for(int j=i+1;j<size;j++){
                count += arr[j];
            }
            arr[i] =count;
        }
        System.out.println(Arrays.toString(arr));

    }
}
