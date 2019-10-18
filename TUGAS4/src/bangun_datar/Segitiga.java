package bangun_datar;
public class Segitiga extends BangunDatar {
    protected double Alas,Tinggi;

    public double Luas(double alas, double tinggi) {
        double luas = 0.5 *Alas*Tinggi;
        return luas;
    }

    @Override
    public void view() {
        System.out.println("Nama Bangun datar adalah Segitiga");
        System.out.println("Luas segitiga adalah " + Luas(Alas, Tinggi));
        }
    }