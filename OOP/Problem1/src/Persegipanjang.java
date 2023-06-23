public class Persegipanjang {
    int panjang;
    int lebar;

    public Persegipanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public void hitungLuas(){
        int luas = panjang*lebar;
        System.out.println("Luas adalah " + luas);
    }
    public void hitungKeliling(){
        int keliling = 2*(panjang+lebar);
        System.out.println("Keliling adalah " + keliling);
    }
}
