package carsambaPractise.day02;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        // 1-Kullanıcı tarafından girilen string ifadenin içindeki sayısal değerleri toplayan metodu yazınız
        Scanner scan = new Scanner(System.in);
        System.out.println("Cumle giriniz : ");
        String cumle = scan.nextLine();
        System.out.println("Sayisal degerler toplami: " + sayisalIfadeleriTopla(cumle));
    }
    private static int sayisalIfadeleriTopla(String cumle) {

        int toplam=0;

        String cumleArr[]=cumle.split("");//1-j-2-ı-3-5-f
        /*
        for (String each:cumleArr) {
            if (Character.isDigit(each.charAt(0))) {
                toplam+=Integer.valueOf(each);
            }
        }
        */


        for (int i = 0; i < cumleArr.length; i++) {
            if (Character.isDigit(cumleArr[i].charAt(0))){// char veri tipinin Wrapper Class larda tanımlanması Character
                toplam+=Integer.valueOf(cumleArr[i]);
            }
        }
        return toplam;


    }
}