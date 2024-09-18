package recursiveAsal;
import java.util.Scanner;

public class Main {
    static boolean prime ( int a, int b ){
        if (a<2) return false;
        if (b==1) return false;
        if (a%b==0) return true;

        return prime(a,b-1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        boolean prime = prime(n,n/2);
        if ( prime==true ){
            System.out.println("Asal sayı değildir.");
        }else System.out.println("Asal sayıdır.");
    }
}
// 3
/// 6 için 6/5 6/4 6/3 6/2