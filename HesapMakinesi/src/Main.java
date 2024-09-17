import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a, b, slc;
        Scanner input = new Scanner(System.in);

        System.out.print("iki sayı giriniz: ");
        a = input.nextInt();
        b = input.nextInt();

        System.out.print("Toplama için 1 \nÇıkartma için 2 \nÇarpma için 3 \n" +
                "Bölme için 4 giriniz.");
        slc = input.nextInt();

        switch (slc) {
            case 1:
                System.out.println(a+b); break;
                case 2:
                    System.out.println(a-b); break;
                    case 3:
                        System.out.println(a*b); break;
                        case 4:
                            if (b==0) System.out.println("0'a bölünme hatası");
                            else System.out.println(a/b); break;
                            default:
                                System.out.println("hatalı giriş yaptınız" );
        }

    }
}