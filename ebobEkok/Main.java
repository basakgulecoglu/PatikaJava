package ebobEkok;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2,k=0 , l=1, p=1;
        System.out.print("1. ve 2. sayıyı giriniz: ");
        n1 = sc.nextInt();
        n2=sc.nextInt();

        //ebob- en büyük ortak bölen

        if ( n1>n2){
            k=n2;
            for ( int i=1; i<=n2; i++){
                if ( (n1%i==0) && (n2%i==0)){
                    k=i;
                }
            }
        }else if (n2>n1){
            k=n1;
            for ( int i=1; i<=n1; i++){
                if ( (n1%i==0) && (n2%i==0)){
                    k=i;
                }
            }
        }
        System.out.println(n1 +" ve "+ n2+ " sayısının ebobu: "+k);

        //ekok- en küçük ortak kat

        if (n1<n2){

            for ( int i=1; i<=n1; i++){
                l=n2*i;
                if (l%n1==0) { p=l; break;}
            }
        }else if (n2<n1){

            for ( int i=1; i<=n2; i++){
                l=n1*i;
                if (l%n2==0) { p=l; break;}
            }
        }else p=n1;
        System.out.println(n1 +" ve "+ n2+ " sayısının ekoku: "+p);


    }
}