import java.util.Scanner;
public class Vucutkitle {
    public static void main(String[] args) {
        double kilo, boy, vucut;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
        boy= input.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz : ");
        kilo = input.nextDouble();
        vucut= kilo /(boy*boy);
        System.out.println(" Vücut Kitle İndeksiniz : "+vucut);


    }
}
