public class Persegi {
    int sisi;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }

    public void luasPersegi (){
        int luas = sisi*sisi;
        System.out.println("Luas persegi adalah " + luas);
    }

    public void kelilingPersegi (){
        int keliling = sisi*4;
        System.out.println("Keliling persegi adalah " + keliling);
    }
}
