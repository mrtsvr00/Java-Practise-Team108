package carsambaPractise;

public class Q2 {
    public static void main(String[] args) {


        // 0-255 e kadar olan harflerin , sayı ve harf değerini konsola yazdırınız.

        for (int i = 0; i <=255 ; i++) {
           // System.out.print(i);

            //System.out.print((int)i);
            if (i>64 && i<91)

            System.out.println((char)(i)+"="+i);

        }
    }
}
