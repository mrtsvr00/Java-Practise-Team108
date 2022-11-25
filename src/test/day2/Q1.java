package test.day2;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        //  Kullanicidan bir sayi aliniz
        //  Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
        //  10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
        //  Sayi 0 dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.


        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi=scan.nextInt();

        if (sayi>=0)

            if (sayi<10)
                System.out.println("Girdiginiz sayi bir rakamdir");
            else
                System.out.println("pozitif sayi");

        else
            System.out.println("negatif sayi");

        System.out.println("*************ternary cozumu*********************");


        System.out.println(sayi<0
                                ?
                                "negatif sayi"
                                :
                                sayi>=0 && sayi<=9 ? "rakam" : "pozitif sayi");
    }
}
