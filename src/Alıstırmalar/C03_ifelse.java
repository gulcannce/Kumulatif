package Alıstırmalar;

import java.util.Scanner;

public class C03_ifelse {
    public static void main(String[] args) {
        /*
        KUllanicidan bir sayi isteyin, sayiyi kontrol edip
        5 ile bolunebiliyorsa "sayi 5`in tam kati" yazdirin
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("bir sayı giriniz");
        int sayı = scanner.nextInt();

        if (sayı % 5 == 0) {
        System.out.println(sayı + " sayı 5'in tam katı");
    }else{
            System.out.println(sayı +" sayı 5'İn tam katı degildir");


        }



    }
}
