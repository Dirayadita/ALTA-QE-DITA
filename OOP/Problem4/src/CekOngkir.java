import java.util.Scanner;

public class CekOngkir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float x, y, z, B;
        char ulang;
        do {

            System.out.println("PROGRAM CEK ONGKIR");
            System.out.println("==================");
            System.out.println();

            System.out.println("Masukkan panjang  : ");
            x = input.nextInt();
            System.out.println("Masukkan lebar  : ");
            y = input.nextInt();
            System.out.println("Masukkan tinggi  : ");
            z = input.nextInt();

            System.out.println("Masukkan berat barang : ");
            B = input.nextFloat();

            System.out.println("Volume barang adalah " + rumusVol(x, y, z) + "m3");
            System.out.println("Berat barang adalah " + berat(B) + "kg");
            System.out.println("Ongkir adalah Rp " + Ongkir(rumusVol(x, y, z), berat(B)));

            System.out.println("Cek ongkir lagi? (y/n)");
            ulang = input.next().charAt(0);
        }
        while (ulang != 'n');
        System.out.println("SILAHKAN DATANG KEMBALI :)");
    }
    public static float rumusVol(float x, float y, float z) {
        float hasil;
        hasil = x * y * z;
        if (hasil < 50) {
            hasil = 50;
        }
        return hasil;
    }
    public  static float berat(float Berat){
        if (Berat < 1){
            Berat = 1;
        }
        return Berat;
    }
    public static double Ongkir(double nilaiA, double nilaiB){
        double  ongkir, hasilA, rumus;
        hasilA = nilaiA/50;
        System.out.println("Berat dimensi barang adalah " + hasilA + "kg");
        rumus = Math.max(hasilA, nilaiB);
        System.out.println();
        if (hasilA > nilaiB){
            System.out.println("Kena Volum");
        } else {
            System.out.println("Kena Berat");
        }
        ongkir = rumus * 5000;
        return ongkir;
    }
}
