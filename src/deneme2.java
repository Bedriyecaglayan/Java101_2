import java.util.Scanner;
import java.lang.Math;
public class deneme2 {
    public static void main(String[] args) {
       /* int a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.println("a kenarı giriniz:");
        a=input.nextInt();
        System.out.println("b kenarı giriniz:");
        c=input.nextInt();
        System.out.println("c kenarı giriniz:");
        c=input.nextInt();
        //c=(a*a)+(b*b);
        double d=Math.sqrt((a*a)+(b*b));
       // System.out.println("ikii kenarın hipotenüsü:" +Math.sqrt(c));
        System.out.println("ikii kenarın hipotenüsü:" +d);*/
            Scanner scanner = new Scanner(System.in);

            System.out.println("ilk kenar uzunluğunu girin: ");
            double kenar1 = scanner.nextDouble();

            System.out.println("ikinci kenar uzunluğunu girin: ");
            double kenar2 = scanner.nextDouble();

            System.out.println("üçüncü kenar uzunluğunu girin: ");
            double kenar3 = scanner.nextDouble();

            // Üçgenin alanını hesaplamak için Heron formülünü kullanalım
            double u = (kenar1 + kenar2 + kenar3) / 2;
            double alan = Math.sqrt(u * (u - kenar1) * (u - kenar2) * (u - kenar3));

            System.out.println("Üçgenin alanı: " + alan);
        }
    }
