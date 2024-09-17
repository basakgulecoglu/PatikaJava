package mukemmelSayi;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int n=sc.nextInt();
        int sum=0, i=0;

        do{
            if(n!=1) {
                i++;

                if (n % i == 0) {
                    sum += i;
                    System.out.println(sum);
                }
            }
        }while(i<n-1);

        if(sum==n) System.out.println(n +" sayısı bir mükemmel sayıdır.");
        else System.out.println(n+ " sayısı mükemmel sayı değildir.");
    }

}

//28 - 1,2,4,7,14
// 0+1=1 1+2