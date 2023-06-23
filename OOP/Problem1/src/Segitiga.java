public class Segitiga {
    int alas;
    int tinggi;
    int sisi;

    public Segitiga(int alas, int tinggi, int sisi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi = sisi;
    }
    public void hitungLuas(){
        int luas = (alas*tinggi)/2;
        System.out.println("Luas segitiga tersebut adalah " + luas);
    }
    public void hituungKeliling(){
        int keliling = alas + (sisi*2);
        System.out.println("Keliling segitiga tersebut adalah " + keliling);
    }
}
