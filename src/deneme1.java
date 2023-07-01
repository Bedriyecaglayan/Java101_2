import java.util.Scanner;

public class deneme1 {
    public static void main(String[] args) {
        double kdv =18;
        double kdv2=8;
        double deger;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir değer giriniz: ");
        deger = input.nextDouble();
        if (deger<=1000) {
            double toplam = ((deger * kdv) / 100) + deger;
            double fark = toplam - deger;
            System.out.println("toplam :" + toplam);
            System.out.println("kdv tutarı:" + fark);
        }
        if (deger>=1001) {
            double toplam = ((deger * kdv2) / 100) + deger;
            double fark = toplam - deger;
            System.out.println("toplam :" + toplam);
            System.out.println("kdv tutarı:" + fark);
        }
    }
}
