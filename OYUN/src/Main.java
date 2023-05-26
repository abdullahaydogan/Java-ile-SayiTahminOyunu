import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //sayı tahmin oyunu;

        Scanner input=new Scanner(System.in);
        Random r=new Random();
        System.out.println("Sayı tahmin oyunu...");
        int hak=5;
        int tahmin;
        int rnum=r.nextInt(29)+1;
        while(hak>0){
            System.out.print("Lütfen tahmininizi giriniz:");
            tahmin=input.nextInt();
            if(tahmin==rnum){
                System.out.println("Tebrikler Doğru Tahmin"+rnum);
            }
            else if(tahmin>rnum){
                System.out.println("Üzgünüm yanlış tahmin.Lütfen daha küçük bir sayı giriniz.");
            }
            else{
                System.out.println("Üzgünüm yanlış tahmin.Lütfen daha büyük bir sayı giriniz..");
            }
            hak--;
        }
        System.out.println("SAYI="+r);

    }
}