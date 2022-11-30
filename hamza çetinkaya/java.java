import java.util.Scanner;
public class java{
  
   public static void main(String[] args) {

      Scanner scan = new Scanner (System.in);


      System.out.print("1.Sayıyı giriniz:");
      int sayi1 = scan.nextInt();
      System.out.print("2.Sayıyı Giriniz");
      int sayi2 = scan.nextInt();

      System.out.println("****İŞLEMİNİZİ SEÇİNİZ****");
      System.out.println("1.Toplama");
      System.out.println("2.Çıkarma");
      System.out.println("3.Çarpma");
      System.out.println("4.Bölme");

      System.out.print("SEÇİMİNİZİ GİRİNİZ=");
      int secim = scan.nextInt();

      if(secim == 1){
        System.out.println("Toplama işleminin sonucu=" + (sayi1 + sayi2) );
      }
      else if (secim == 2){
        System.out.println("çıkarma işleminin sonucu="+ ( sayi1-sayi2 ) );
      }
      else if (secim == 3){
        System.out.println("çarpma işleminin sonucu"+ ( sayi1 * sayi2) );
      }
      else if (secim == 4){
        System.out.println("bölme işleminin sonucu=" + (float) sayi1 / sayi2);
      }
      else{
        System.out.println("yanlış secim yaptınız.seciminizi kontrol ediniz.");
      }

   }
  
}
