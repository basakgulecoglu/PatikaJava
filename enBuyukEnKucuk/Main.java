package enBuyukEnKucuk;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("kaç sayı gireceksiniz? : ");
        int count, no, enK, enB, i=1;
        count =sc.nextInt();
        System.out.print("İlk sayıyı giriniz: ");
        no = sc.nextInt(); enK=no; enB=no;
        do{
            i++;
            System.out.print("Lütfen " + i + ". sayıyı giriniz: ");
            no = sc.nextInt();

            if (count == 1) {
                enK = no;
                enB = no;
            }
            else {
                if (no < enK) enK = no;
                if (no > enB) enB = no;
            }

        }while(i<count);

        System.out.println("En büyük sayı: "+ enB);
        System.out.print("En küçük sayı: "+ enK);

    }
}
