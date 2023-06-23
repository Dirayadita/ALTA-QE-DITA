import java.util.Scanner;

public class LuasSegitiga {
    public static void main(String[] args) {
        //tools scanner
        Scanner input = new Scanner(System.in);

        //print pembukaan
        System.out.println("HITUNG LUAS SEGITIGA");

        //buat inputan alas
        System.out.println("ALAS : ");
        double alas = input.nextFloat();

        //buat inputan tinggi
        System.out.println("TINGGI : ");
        double tinggi = input.nextFloat();

        //buat rumus luas
        double luas = (alas*tinggi)/2;

        //print hasil rumus
        System.out.println("Luasnya segitiga tersebut adalah " + luas + "cm");
    }
}