package Alıstırmalar;

public class C02_forloop {
    public static void main(String[] args) {
        /*
        Bir Dizinin Elemanlarını Toplama
         */
        int[] sayılar = {1,2,3,4,5,6,7,8,9};

        int sayı = 0;

        for (int i = 0; i < sayılar.length; i++) {
            sayı += sayılar[i];

        }
        System.out.println("toplam = " +sayı); // 45
    }

}
