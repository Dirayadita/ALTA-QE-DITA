import java.util.Scanner;

public class FaktorBilangan {
    public static void main(String[] args) {
        System.out.println("FAKTOR CHECKER");

        Scanner input = new Scanner(System.in);

        System.out.println("Input Angka : ");
        int angka = input.nextInt();

        for (int i =1; i<=angka; i++){
            if(angka%i ==0){
            System.out.println(i);}
        }
        System.out.println("Itulah bilangan faktor dari angka " + angka);
    }
}