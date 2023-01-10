package abdullahPractise.day06.geometrikSekiller;

import java.util.Scanner;

public class Daire implements IIslemler{
    Scanner scan=new Scanner(System.in);
    int r=0;
    @Override
    public void alan() {
        System.out.println("Dairenin yaricapini giriniz");
        r=scan.nextInt();
        System.out.println("Alan: " + 3.14*r*r);

    }

    @Override
    public void cevre() {
        System.out.println("Dairenin yaricapini giriniz");
        r=scan.nextInt();
        System.out.println("Cevre: " + 2*3.14*r);

    }
}
