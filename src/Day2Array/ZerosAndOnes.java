package Day2Array;

import java.util.Arrays;
import java.util.Scanner;

public class ZerosAndOnes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int zero = 0;
        int one = 0;
        int arr[] = new int[size];
        int sarr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }

        //
        for(int i=0;i<size;i++){
            if(arr[i]==0){
                zero++;
            }
        }
        System.out.println(zero);

        for(int i=0;i<size;i++){
            if(arr[i]==1){
                one++;
            }
        }

        for(int i=0;i<zero;i++){
            sarr[i] = 0;
        }
        for(int j=zero;j<size;j++){
            sarr[j]=1;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(sarr));
    }
}
