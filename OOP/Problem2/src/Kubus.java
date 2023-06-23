public class Kubus {
    int sisiKubus;

    public Kubus(int sisiKubus) {
        this.sisiKubus = sisiKubus;
    }

    public void hitungVolume(){
         int vol = (int) Math.pow (sisiKubus,3);
         System.out.println("Volume kubus tersebut adalah " + vol);
    }
}
