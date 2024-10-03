import java.util.Scanner;

public class bordrohesaplama {

    /*
            Brüt maaş: Kullanıcıdan girilmesi isteniyor.

        SGK İşçi Payı: Brüt maaşın %14'ü olarak hesaplanıyor.

        İşsizlik İşçi Payı: Brüt maaşın %1'i olarak hesaplanıyor.

        Gelir Vergisi: Gelir vergisi matrahına göre %15 oranında hesaplanıyor.

        İndirimli Gelir Vergisi: Gelir vergisinden 6000 TL indirim yapılıyor.

        Damga Vergisi: Brüt maaşın %0.759'u

        İndirimli Damga Vergisi: Damga vergisinden 1500 TL indirim uygulanıyor.

        Kesintiler Toplamı: Tüm kesintiler toplanarak hesaplanıyor.

        Net Maaş: Brüt maaştan tüm kesintiler çıkarılarak net maaş hesaplanıyor.
       */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Brüt Maaşınızı giriniz: ");

        double brutmaas = scanner.nextDouble();

        float sgkiscipayiorani = 0.14f;
        float issizlikiscipayiorani = 0.01f;
        float sgkmatrahorani  = sgkiscipayiorani + issizlikiscipayiorani;

        // SGK işçi payı %14
        float sgkiscipayi = (float) (brutmaas * sgkiscipayiorani);

        // İşsizlik İşçi Payı %1
        double issizlikiscipayi = brutmaas * 0.01;

        // SGK matrahi (sgk isci payi + issizlik isci payi)

        double sgkmatrah = sgkiscipayi + issizlikiscipayi;

        // gelir vergisi matrahi
        double gelirvergisimatrahi = brutmaas - sgkmatrah;

        // gelir vergisi %15
        double gelirvergisi =  gelirvergisimatrahi * 0.15;

        // indirimli gelir vergisi
        double augvi = 2550.5;
        double indirimligelirvergisi = gelirvergisi - augvi;

        // damga vergisi %0.759
        double damgavergisi = brutmaas * 0.00759;


        // indrimili damga vergisi
        double audvi= 151.82;
        float indirimlidamgavergisi = (float)  (damgavergisi - audvi);



        // kesintiler toplami
        float kesintilertoplami = (float) (sgkmatrah + indirimligelirvergisi + indirimlidamgavergisi);

        //net maas
        float netmaas = (float) (brutmaas - kesintilertoplami);


        //    SONUC

        System.out.println("Brüt Maaş               : " + brutmaas + " TL");
        System.out.println("SGK İşçi Payı           : " + sgkiscipayi + " TL");
        System.out.println("İşsizlik İşçi payı      : " + issizlikiscipayi + " TL");
        System.out.println("SGK Matrahı             : " + sgkmatrah + " TL");
        System.out.println("Gelir Vergisi Matrahı   : " + gelirvergisimatrahi + " TL");
        System.out.println("Gelir Vergisi           : " + gelirvergisi + " TL");
        System.out.println("İndirimli Gelir Vergisi : " + indirimligelirvergisi + " TL");
        System.out.println("Damga Vergisi           : " + damgavergisi + " TL");
        System.out.println("İndirimli Damga Vergisi : " + indirimlidamgavergisi + " TL");
        System.out.println("Kesintiler Toplamı      : " + kesintilertoplami + " TL");
        System.out.println("Net Maaş                : " + netmaas + " TL");



    }
}
