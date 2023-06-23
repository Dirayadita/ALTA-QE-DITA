import java.util.Scanner;

public class XYZ {
    public static void main(String[] args) {
        System.out.println("PROGRAM XYZ");
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan angka : ");
        int angka = input.nextInt();

        drawXYZ(angka);
    }
    public static void drawXYZ(int height) {
        char[] huruf = {'X', 'Y', 'Z'};
        int totalHuruf = 0;

        for (int b1 = 0; b1 < height; b1++){
            for(int b2 = 0; b2 < height; b2++){
                totalHuruf = totalHuruf + 1;
                if (totalHuruf % 3 == 0) {
                    System.out.print(huruf[0]);
                } else if (totalHuruf % 2 == 0) {
                        System.out.print(huruf[2]);
                    } else {
                    if ((b1 + b2) % 2 == 0) {
                        System.out.print(huruf[1]);
                    }
                }
            }
            System.out.println();
        }
        System.out.println("Sekian terima kasih :)");
    }
}