package Day2Array;

import java.util.Scanner;

public class RepeatedElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = input.nextInt();
        }

        for(int i=0;i<size;i++){
            int repeat=0;
            for(int j=i+1;j<size;j++){
                if(arr[i]==arr[j]){
                    repeat = arr[i];
                    System.out.println(repeat);
                }
            }
        }
    }
}
