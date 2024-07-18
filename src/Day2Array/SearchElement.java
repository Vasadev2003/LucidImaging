package Day2Array;
import java.util.Scanner;
public class SearchElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int arr[] = new int[size];


        for(int i=0;i<size;i++){
            arr[i] = input.nextInt();
        }
        //
        int key = input.nextInt();
        for(int i=0;i<size;i++){
            if(arr[i]==key){
                System.out.println("Found at index "+" "+i);
            }
        }
    }
}
