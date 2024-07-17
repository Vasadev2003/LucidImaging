package Day1Problem;
import java.util.Scanner;
public class Factorial {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int user = input.nextInt();
        int fact = 1;
        if(user<0){
            System.out.println("Please enter valid no");
        }
        for(int i=1;i<=user;i++){
           fact*=i;
        }
        System.out.println(fact);
    }
}
