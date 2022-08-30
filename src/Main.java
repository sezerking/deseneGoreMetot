import java.util.Scanner;

public class Main {
    static void dongu(int sayi){

        if (sayi>0){
            System.out.printf("%d ",sayi);
            dongu(sayi-5);

        }
        System.out.printf(" %d",sayi);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int sayi=scan.nextInt();
        dongu(sayi);
    }
}
