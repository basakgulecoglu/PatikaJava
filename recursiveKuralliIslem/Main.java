package recursiveKuralliIslem;
import java.util.Scanner;

public class Main {

    static int rule( int a){
        //int a=k;

        if (a<=0) {
            a+=5;
            System.out.print(a+ " ");
            return rule(a);
        }else {
            a -= 5;
            System.out.print(a + " ");
            return rule(a);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        System.out.print( n+ " ");
        rule(n);
    }
}


// Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan
// 5 rakamını çıkarın. Her çıkarma işlemi sırasında ekrana son değeri yazdırın.
// Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.
// Yine her ekleme işleminde sayının son değerini ekrana yazdırın.