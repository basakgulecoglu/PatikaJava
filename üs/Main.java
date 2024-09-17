package üs;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      //Java döngüler ile girilen sayıya kadar olan 4 ve 5'in
        //kuvvetlerini ekrana yazdıran programı yazıyoruz.
        System.out.print("Bir sayı giriniz: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i*=4) {
            System.out.println("totalFor4: " + i);
        }
        for (int i = 1; i <= n; i*=5) {
            System.out.println("totalFor4: " + i);
        }




    }
}
