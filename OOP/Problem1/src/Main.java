import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("PROGRAM HITUNG LUAS DAN KELILING");
        System.out.println("=====================");
        System.out.println(" ");

        System.out.println("HITUNG LUAS dan KELILING PERSEGI PANJANG");

        System.out.println("Masukkan panjang : ");
        int panjang = input.nextInt();
        System.out.println("Masukkan lebar : ");
        int lebar = input.nextInt();

        Persegipanjang persegipanjang = new Persegipanjang(panjang,lebar);

        persegipanjang.hitungLuas();
        persegipanjang.hitungKeliling();


        System.out.println("=====================");

        System.out.println("HITUNG LUAS dan KELILING PERSEGI");
        System.out.println("Masukkan sisi persegi : ");
        int sisi = input.nextInt();

        Persegi persegi = new Persegi(sisi);

        persegi.luasPersegi();
        persegi.kelilingPersegi();

        System.out.println("=====================");

        System.out.println("HITUNG LUAS dan KELILING SEGITIGA");
        System.out.println("Masukkan nilai alas : ");
        int alas = input.nextInt();
        System.out.println("Masukkan nilai tinggi : ");
        int tinggi = input.nextInt();
        System.out.println("Masukkan nilai sisi : ");
        int sisi2 = input.nextInt();

        Segitiga segitiga = new Segitiga(alas,tinggi,sisi2);

        segitiga.hitungLuas();
        segitiga.hituungKeliling();

        System.out.println("=====================");
        System.out.println("Sekian program perhitungan luas dan keliling");
        System.out.println("Terima kasih :)");

    }
}
