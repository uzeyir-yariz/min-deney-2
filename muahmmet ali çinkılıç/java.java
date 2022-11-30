import java.util.scanner;
public class   java{
    public static void main(string[] args){
        scanner scan = new scanner(system.in);
    }

        system.out.print("1. sayı giriniz:");
        int sayi1 = scan.nextInt();
        system.out.print("2. sayı giriniz:");
        int sayi2 = scan.nextInt();
        
        system.out.println("****İsleminizi Seçiniz****");
        system.out.println("1. TOPLAMA");
        system.out.println(" 2.  ÇIKARMA");
        system.out.println("3. ÇARPMA");
        system.out.println("4. BÖLME");

        system.out.print("Seçiminizi girin:");
        int secim = scan.nextInt();
        if(secim == 1){
            system.out.println("Toplama İsleminin Sonucu =" + (sayi1 + sayi2));

        }
        else  if(secim ==2){
            system.out.println("Çıkarma İsleminin Sonucu = " + (sayi1- sayi2));

        }
         else if(secim == 3){
             system.out.println( "Çarpma İsleminin Sonucu = " + (syi1* sayi2));

         }
         else if(secim ==4){
             system.out.println("Bölme İsleminin Sonucu = " + (syi1/sayi2));


         }

         else{
             system.out.println("Yanlıs Secim Yaptınız. Seciminizi Kontrol Ediniz");
         }



}