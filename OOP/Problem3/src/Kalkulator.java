import java.util.Scanner;

import static java.lang.System.out;

public class Kalkulator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float x, y;
        char ulang;
        do
        {
            out.println("PROGRAM KALKULATOR");
            out.println("Pilih salah satu operator");
            out.println("(A) Kali, (B) Bagi, (C) Tambah, (D) Kurang ");
            char pilihan = input.next().charAt(0);
            out.println("Input angka pertama : ");
            x = input.nextInt();
            out.println("Input angka kedua : ");
            y = input.nextInt();


            switch (pilihan) {
                case 'A' -> {
                    out.println("Hasil kali adalah " + Kali(x, y));
                }
                case 'B' -> {
                    out.println("Hasil bagi adalah " + Bagi(x, y));
                }
                case 'C' -> {
                    out.println("Hasil tambah adalah " + Tambah(x, y));
                }
                case 'D' -> {
                    out.println("Hasil kurang adalah " + Kurang(x, y));
                }
            }
            out.println();
            out.println("Lanjut? (y/n)");
            ulang = input.next().charAt(0);
        }
        while (ulang != 'n');
        out.println("TERIMAKASIH :)");
    }

            public static float Bagi ( float x, float y){
                double hasil = x / y;
                return (float) hasil;
            }
            public static float Kali ( float x, float y){
                float hasil = x * y;
                return hasil;
            }
            public static float Tambah ( float x, float y){
                float hasil = x + y;
                return hasil;
            }
            public static float Kurang ( float x, float y){
                float hasil = x - y;
                return hasil;
    }
}



