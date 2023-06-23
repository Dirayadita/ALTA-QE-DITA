public class Tabung {
    int jari;
    int tinggi;

    public Tabung(int jari, int tinggi) {
        this.jari = jari;
        this.tinggi = tinggi;
    }

    public void hitungVolume(){
        int jaari = (int) Math.pow (jari,2);
        int luas = (int) (3.14*jaari);
        int vol = luas * tinggi;
        System.out.println("Volume kubus tersebut adalah " + vol);
    }
}
