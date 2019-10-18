package bangun_datar;
public class Lingkaran extends BangunDatar {
    
    protected double Jari_Jari;
    
    public double Luas (double jari_jari){
    double luas = 3.14 * jari_jari * jari_jari;
    return luas;
    }

    public double Keliling(double jari_jari) {
        double keliling = 2 * 3.14 * jari_jari;
        return keliling;
    }
    
    public void view(){
        System.out.println("Nama Bangun datar adalah lingkaran");
        System.out.println("Luasnya adalah :" +Luas(Jari_Jari)+" cm^2");
        System.out.println("Keliling adalah :"+Keliling(Jari_Jari)+" cm");
        }
    }
