import java.util.Scanner;

public class Notortalamasihesaplama {

    public static void main(String[] args) {
        // Değişkenleri oluştur
        int mat, fizik, kimya,turkce, tarih, muzik;

        // Scannner sınıfını tanımama
        Scanner inp = new Scanner(System.in);

        System.out.println(" matematik notunuz :");
        mat = inp.nextInt();

        System.out.println(" fizik notunuz :");
        fizik = inp.nextInt();

        System.out.println(" kimya notunuz :");
        kimya = inp.nextInt();

        System.out.println(" turkce notunuz :");
        turkce = inp.nextInt();

        System.out.println(" tarih notunuz :");
        tarih= inp.nextInt();

        System.out.println(" muzik notunuz :");
        muzik= inp.nextInt();

        int toplam = (mat + fizik + kimya + tarih + muzik);
        double sonuc = toplam / 6.0;
        System.out.println(sonuc);

    }
}
