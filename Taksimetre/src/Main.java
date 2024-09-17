import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int acilisUcr = 10;
        double a=2.20;
        double km;
        int min= 20;
        System.out.print("kaç kilometre gidileceğini giriniz: ");
        km = sc.nextDouble();
        System.out.println("Gidilecek km: " +km);

        double gkm= km*a;
        System.out.println(gkm);

        double ucret= acilisUcr + gkm;
        System.out.println(ucret);

        double b= ucret<20 ? min : ucret;
        System.out.print("Ödenecek tutar: ");

    }
}