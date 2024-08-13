import java.util.Random;
import java.util.Scanner;
// girilen iki sayı arasında girilen sayı kadar random sayı üreten program.
public class rastgeleDizi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin minimum değerini giriniz : ");
        int diziMin = input.nextInt();
        System.out.print("Dizinin maksimum değerini giriniz : ");
        int diziMax = input.nextInt();
        System.out.print("Dizi boyutunu giriniz : ");
        int diziBoyutu = input.nextInt();

        Random rnd = new Random();
        int[] dizi = new int[diziBoyutu];

        System.out.println("Dizi oluşturuluyor..");

        for (int i = 0; i < dizi.length; i++) {

            dizi[i] = rnd.nextInt(diziMin,diziMax);
            
        }

        for (int i = 0; i < dizi.length; i++) {
            
            System.out.println("Sayı " + (i+1) + " = " + dizi[i]);
           
        }

    }
}
