import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("PROGRAM PERHITUNGAN VOLUME");
        Scanner input = new Scanner(System.in);
        System.out.println("=================");
        System.out.println(" ");

        System.out.println("VOLUME KUBUS");
        System.out.println("Masukkan sisi kubus : ");
        int sisi = input.nextInt();

        Kubus kubus = new Kubus(sisi);

        kubus.hitungVolume();

        System.out.println("=================");

        System.out.println("VOLUME BALOK");
        System.out.println("Masukkan panjang balok : ");
        int panjang = input.nextInt();
        System.out.println("Masukkan lebar balok : ");
        int lebar = input.nextInt();
        System.out.println("Masukkan tinggi balok : ");
        int tinggi = input.nextInt();

        Balok balok = new Balok(panjang,lebar,tinggi);

        balok.hitungVolume();

        System.out.println("=================");

        System.out.println("VOLUME TABUNG");
        System.out.println("Masukkan jari-jari tabung : ");
        int jari = input.nextInt();
        System.out.println("Masukkan tinggi tabung : ");
        int tinggi2 = input.nextInt();

        Tabung tabung = new Tabung(jari,tinggi2);

        tabung.hitungVolume();

        System.out.println("=================");
        System.out.println();
        System.out.println("Sekian Program Volume");
        System.out.println("Terima kasih :)");

    }
}