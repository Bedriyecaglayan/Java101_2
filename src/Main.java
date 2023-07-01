import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* System.out.println("Java101 \nPatikası\rBaşlıyoruz");
        System.out.println("Java101\'deyiz");
        System.out.println("Java!01 \"dersleri\" ");
        System.out.println("Java101\\klasor\\metin.txt");
        // burası slaş \ denemeleri örnekleri
        /* birden fazla yorum çoklu yorum satırı yaniğğ */

        /* 2. ORNEK
        int numberOne, numberTwo=2,numberTree;
        numberOne = 5;
        numberTree=numberOne + numberTwo;
        System.out.println(numberTree); */

        /* 3.ORNEK
        byte vByte = 100;

        short vShort = 1000;
        System.out.println(vByte);
        System.out.println(vShort); */
        /* float vFloat=1;
        System.out.println(vFloat); */

        /* 4.ORNEK
        char vChar='b';
        char vChar2=98;
        System.out.println(vChar);
        System.out.println(vChar2);

        String vStr = "-Java101 Patikası-";
        System.out.println(vStr); */

        /*5.ORNEK
        int a=5, b=2;
        a += b;
        a -= b;
        a *=b;
        System.out.println(a+b);
        System.out.println(a*b);
        System.out.println(a-b);
        System.out.println(a%b); */
        /* 6.ORNEK
        int a=5, b=6, c=5;
        boolean kosul1 = a==b;
        boolean kosul2 = b>=c;
        boolean sonuc = kosul1 || kosul2;
        boolean sonuc2=!((a==b) || (a>=c));

        String str = (sonuc) ? "Doğru": "Yanlış";
        System.out.println(str);
        System.out.println(sonuc2);
        System.out.println(!sonuc); */
       /* 7.ORNEK
        int a;
        Scanner input = new Scanner(System.in);
        System.out.print("A sayısını giriniz:");
        a=input.nextInt();

        System.out.println("A sayısı: "+a); */
        int mat,fiz,kim,tur,trh,mzk;
        Scanner input= new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz:");
        mat = input.nextInt();

        System.out.print("Fizik notunuzu giriniz:");
        fiz = input.nextInt();

        System.out.print("Kimya notunuzu giriniz:");
        kim = input.nextInt();


        System.out.print("Türkçe notunuzu giriniz:");
        tur = input.nextInt();


        System.out.print("Tarih notunuzu giriniz:");
        trh = input.nextInt();

        System.out.print("Müzik notunuzu giriniz:");
        mzk = input.nextInt();

        int top;
        top = (mat+fiz+kim+tur+trh+mzk);
        double ort=top/6;
        System.out.println("Ortalamanız :"+ort);
        String son =(ort>60)||(ort==60)? "Geçti": "Kaldı";
        System.out.println(son);
    }
}
