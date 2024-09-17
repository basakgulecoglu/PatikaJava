import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double kilo, boy;

        System.out.print("Kilonuzu giriniz: ");
        kilo = input.nextDouble();
        System.out.print("Boyunuzu giriniz: ");
        boy = input.nextDouble();

        double total = kilo / (boy * boy);

        System.out.println("Vücut kitle endeksiniz: " + total );


    }
}