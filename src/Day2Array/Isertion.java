package Day2Array;


import java.util.Arrays;

import java.util.Scanner;

public class Isertion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int elem = input.nextInt();
        int pos = input.nextInt();
        int newArr[] = new int[size+1];

        //filling with copy
        for(int i=0;i<pos;i++){
            newArr[i]=arr[i];
        }

        //insert
        newArr[pos] = elem;

        //filling with next
        for(int i=pos;i<size;i++){
            newArr[i+1]=arr[i];
        }
        System.out.println(Arrays.toString(newArr));


    }
}