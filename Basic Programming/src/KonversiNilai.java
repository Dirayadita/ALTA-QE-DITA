import java.util.Scanner;

public class KonversiNilai {

    public static void main(String[] args) {
        System.out.println("NILAI UJIAN CHECKER");

        Scanner input = new Scanner((System.in));

        System.out.println("Masukkan nilai ujian : ");
        double nilai = input.nextFloat();

        if (nilai <= 100 && nilai >= 80 ){
            System.out.println("Nilai siswa A");
        } else {
            if (nilai <= 79 && nilai >= 65){
                System.out.println("Nilai siswa B+");
            } else {
                if (nilai <= 64 && nilai >= 50){
                    System.out.println("Nilai siswa B");
                } else {
                    if (nilai <= 49 && nilai >= 35){
                        System.out.println("Nilai siswa C");
                    } else {
                        if (nilai <= 34 && nilai >= 0){
                            System.out.println("Nilai siswa D");
                        } else {
                                System.out.println("INVALID NUMBER");
                        }
                    }
                }
            }
        }
    }
}


