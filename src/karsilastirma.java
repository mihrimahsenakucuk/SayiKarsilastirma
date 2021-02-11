import java.util.Scanner;

public class karsilastirma {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("İlk sayiyi giriniz");
        int sayi1 = scan.nextInt();

        System.out.println("İkinci sayıyı giriniz");
        int sayi2 = scan.nextInt();

        if (sayi1 > sayi2) {
            System.out.println(sayi1 + ">" + sayi2);
        }
        else if (sayi1 < sayi2) {
            System.out.println(sayi2 + ">" + sayi1);
        }
        else {
            System.out.println(sayi1 + "=" + sayi2);
        }
    }

}
