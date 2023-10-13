import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double a, armut,e,elma,d,domates,m,muz,p,patlıcan,toplam;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Armut Kaç Kilo?: ");
        armut=scanner.nextDouble();
        System.out.print("Elma Kaç Kilo?: ");
        elma=scanner.nextDouble();
        System.out.print("Domates Kaç Kilo?: ");
        domates=scanner.nextDouble();
        System.out.print("Muz Kaç Kilo?: ");
        muz=scanner.nextDouble();
        System.out.print("Patlıcan Kaç Kilo?: ");
        patlıcan=scanner.nextDouble();

        a=armut*2.14;
        e=elma*3.67;
        d=domates*1.11;
        m=muz*0.95;
        p=patlıcan*5.0;

        toplam=a+e+d+m+p;
        System.out.println("Toplam Tutar: "+toplam+" TL");


    }
}