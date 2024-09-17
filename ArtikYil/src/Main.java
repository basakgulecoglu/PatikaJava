import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yil;
        System.out.print("Yıl giriniz: ");
        yil = sc.nextInt();
        int mod= yil%100;
        if( (mod==0) && (yil%400==0) ) System.out.println("Artık yıldır");
        else if ((mod==0) && ( yil%400 !=0))
            System.out.println("Artık yıl değildir.");
        else if ((mod!=0) && (yil %4==0)) System.out.println("Artık yıldır");
        else System.out.println("Artık yıl değildir.");



    }
}
