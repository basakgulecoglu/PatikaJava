import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double u,k;
        u = sc.nextDouble();
        k = sc.nextDouble();
        System.out.println("Üçgenin uzun kenarı: " +u);
        System.out.println("Üçgenin kısa kenarı: " + k);


        double hipo= Math.sqrt(u*u+k*k);
        System.out.println("Hipotenüs: " + hipo);
    }
}