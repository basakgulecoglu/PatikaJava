import java.util.Scanner;
/*Doğum Tarihi %12 = 0 ➜ Maymun

Doğum Tarihi %12 = 1 ➜ Horoz

Doğum Tarihi %12 = 2 ➜ Köpek

Doğum Tarihi %12 = 3 ➜ Domuz

Doğum Tarihi %12 = 4 ➜ Fare

Doğum Tarihi %12 = 5 ➜ Öküz

Doğum Tarihi %12 = 6 ➜ Kaplan

Doğum Tarihi %12 = 7 ➜ Tavşan

Doğum Tarihi %12 = 8 ➜ Ejderha

Doğum Tarihi %12 = 9 ➜ Yılan

Doğum Tarihi %12 = 10 ➜ At

Doğum Tarihi %12 = 11 ➜ Koyun*/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dogumYili;

        System.out.print("Lütfen dogum yilinizi giriniz: ");
        dogumYili = sc.nextInt();

        int kalan= dogumYili%12;
        System.out.println(kalan);

        switch (kalan) {
            case 0:
                System.out.println("Çin Zodyağınız Maymun"); break;
                case 1:
                    System.out.println("Çin Zodyağınız Horoz"); break;
                    case 2:
                        System.out.println("Çin Zodyağınız Köpek"); break;
        }

    }
}
