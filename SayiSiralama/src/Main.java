import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, n3,enKucuk,orta,enBuyuk;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        n1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        n2 = input.nextInt();

        System.out.print("Üçüncü sayıyı giriniz: ");
        n3 = input.nextInt();

        if (n1 > n2 && n1 > n3) {
            if (n2 > n3) {
              //  System.out.print("n3<n2<n1");
                enKucuk=n3;
                orta=n2;
                enBuyuk=n1;
            } else {
              //  System.out.print("n2<n3<n1");
                enKucuk=n2;
                orta=n3;
                enBuyuk=n1;
            }
        } else if (n2 > n1 && n2 > n3) {
            if (n1 > n3) {
                // System.out.println("n3<n1<n2");
                enKucuk=n3;
                orta=n1;
                enBuyuk=n2;
            } else {
                // System.out.print("n1<n3<n2");
                enKucuk=n1;
                orta=n3;
                enBuyuk=n2;
            }
        } else {
            if (n1 > n2) {
               // System.out.print("n2<n1<n3");
                enKucuk=n2;
                orta=n1;
                enBuyuk=n3;
            } else {
               // System.out.println("n1<n2<n3");
                enKucuk=n1;
                orta=n2;
                enBuyuk=n3;
            }
        }
        System.out.println("Sıralama: " + enKucuk + " < " + orta + " < " + enBuyuk);

    }
}