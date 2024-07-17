package Day1Problem;
import java.util.Scanner;
public class NthnoFibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int user = input.nextInt();
        int start = 0;
        int end = 1;
        int curr = 0;
        for(int i=2;i<user;i++){
            curr = start+end;
            start = end;
            end = curr;
        }
        System.out.println(curr);
    }
}
