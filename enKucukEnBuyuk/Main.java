package enKucukEnBuyuk;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SequencedCollection;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dizi = {15,12,788,1,-1,-778,2,-0};
        Arrays.sort(dizi);

        System.out.print("Aranmasını istediniz değeri giriniz: ");
        int aDeger=sc.nextInt();

        Search search = new Search();
        search.bul(dizi, aDeger);

    }
}
