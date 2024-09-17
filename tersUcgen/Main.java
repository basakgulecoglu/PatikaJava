package tersUcgen;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you wish to enter: ");
        int n = sc.nextInt();

       for (int i = n; i >= 1; i--) {
            for (int j = 0; (j < (2*i-1)); j++) {
                System.out.print("*");

            }
            System.out.println();

            if (i<=n){
                for (int j=i-1; j<n; j++) {
                    System.out.print(" ");
                }
            }

       }
    }
}
