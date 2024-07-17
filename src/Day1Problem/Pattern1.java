package Day1Problem;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int user = input.nextInt();
        for(int i=1;i<=user;i++){
            for(int j=1;j<=user-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
