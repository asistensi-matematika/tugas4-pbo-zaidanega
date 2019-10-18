package bangun_datar;
public class Persegi extends BangunDatar {
    protected double Sisi;

    public double Luas(double sisi) {
        double luas = sisi * sisi;
        return luas;
    }

    public double Keliling(double sisi) {
        double keliling = 4 * sisi;
        return keliling;
    }
    public void view(){
        System.out.println("Nama Bangun datar adalah persegi");
        System.out.println("Luasnya adalah :" +Luas(Sisi)+" cm^2");
        System.out.println("Keliling adalah :"+Keliling(Sisi)+" cm");
        }

   
    }

