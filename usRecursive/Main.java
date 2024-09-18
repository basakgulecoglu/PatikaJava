package usRecursive;
import java.util.Scanner;

public class Main {
    static int power( int a, int b){
        if (b == 1) return a;
        return a * power(a,b-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("İki sayı giriniz: ");
        int n = sc.nextInt();
        int m= sc.nextInt();
        System.out.println(power(n,m));

    }
}

// 2^3 --- 2*2*2
//2*(power(2,2))
//2* ( 2*(2,1))
// 2* (2* ( (2,0)