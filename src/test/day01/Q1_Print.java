package day01;

public class Q1_Print {
    public static void main(String[] args) {


        /*
    Konsolda :
    "Hello "\ / 'World'"
    yazdiriniz.
     */

        /*
      \n (or \r)  : Starts from a new line : Metni bir alt satırdan itibaren yazdırır.
              \t  : Horizontal tab         : Metni yatayda 1 tab miktarı kaydırır.
              \\  : Prints a back slash    : \  Ters slash yazdırır
              \'  : Prints single quote    : '  Tek tırnak yazdırır.
              \"  : Prints double quote    : "  Çift tırnak yazdırır.
     */

        String isim = "Ahmet";
        System.out.println("Ahmet");// Ahmet
        System.out.println("n");//n

       /* "Hello "\
        /'World'"
        */

        System.out.println("\"Hello \"\\\n/\'World\'\"");



    }
}
