package aysePractise.day03;

import java.util.Scanner;

public class Q1_DikUcgen {


     /*
        Kullanicidan uc adet sayi alarak bu sayilarin
        bir dik ucgenin kenar uzunluklari olup olmadigini hesaplatan bir kod yaziniz
        NOT:
        Bir ucgenin dik oldugunu anlamak icin a2+b2=c2 pisagor
        denkleminden yararlanabilirsiniz.
        -----Ornek Ekran Ciktisi-----
        ilk kenari giriniz: 2
        ikinci kenari giriniz: 15
        üçüncü kenari giriniz: 7
        Bu bir dik ucgen degildir.
        Bu bir dik ucgendir.
     */
     public static void main(String[] args) {

         Scanner scan=new Scanner(System.in);
         System.out.println("Ucgenin uc kenar uzunlugunu giriniz");
         int a=scan.nextInt();
         int b=scan.nextInt();
         int c=scan.nextInt();

         if (!(a>0 && b>0 && c>0)){
             System.out.println("Gecersiz giris");

         }else

             if (a*a + b*b ==c*c || b*b +c*c==a*a || a*a + c*c==b*b){
                 System.out.println("Dik Ucgen");
             }else
                 System.out.println("Dik Ucgen degil");

     }





}
