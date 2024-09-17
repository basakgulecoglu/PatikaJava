/*Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
 eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin unuttuğu şifre
 ile aynı olmaması gerektiğini kontrol edip,
şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz."
sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName="basak", password="12345", ans, newPassword;
        System.out.print("kullanıcı adı giriniz: ");
        String user = input.nextLine();
        System.out.print("Şifre giriniz: ");
        String pass = input.nextLine();

        if ( userName.equals(user) && password.equals(pass)) {
            System.out.println("Sisteme giriş yaptınız.");
        }else if ( !(userName.equals(user)) && (password.equals(pass)) ) {
            System.out.println("Kullanıcı adınızı yanlış giriniz.");
        }else if ( !(userName.equals(user)) && (!(password.equals(pass))) ) {
            System.out.println("kullanıcı adı veya şifre yanlış");
        }else {
            System.out.print("Şifreyi yanlış girdiniz. \n Yeni şifre oluşturmak isterseniz evet" +
                    " istemezseniz hayır giriniz:");

            ans = input.nextLine();
            if ( ans.equals("evet")){
                System.out.print("Yeni şifreyi giriniz:");
                newPassword = input.nextLine();
                if (newPassword.equals(password)) {
                    System.out.println("Lütfen eski şifreden farklı bir şifre giriniz");
                    newPassword = input.nextLine();
                }
                System.out.println("Yeni şifre başarı ile oluturuldu");
            }else System.out.println("Sistemden cıkıs sağlandı.");
        }

    }
}