package bangun_datar;
import java.util.Scanner;
/**
 *
 * @author ZAIDAN EGA 0066
 */
public class MainClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BangunDatar B = new BangunDatar();
        B.view();
        System.out.print("Masukan pilihan anda : ");
        int pilih = input.nextInt();
        switch (pilih) {
            case 1:
                Persegi X = new Persegi();
                System.out.print("Masukkan panjang sisi : ");
                X.Sisi = input.nextDouble();
                X.view();
                break;
            case 2:
                Lingkaran Y = new Lingkaran();
                System.out.print("Masukkan panjang jari-jari : ");
                Y.Jari_Jari = input.nextDouble();
                Y.view();
                break;
            case 3:
                JenisSegitiga Z = new JenisSegitiga();
                System.out.println("Pilih segitiga yang diinginkan:");
                System.out.println("1.Segitiga siku-siku");
                System.out.println("2.Segitiga sama sisi");
                System.out.print("Masukkan pilihan Anda : ");
                int pilihSegitiga = input.nextInt();
                System.out.print("Masukkan panjang alas : ");
                Z.Alas = input.nextDouble();
                System.out.print("Masukkan panjang tinggi : ");
                Z.Tinggi = input.nextDouble();
                Z.view();
                switch (pilihSegitiga) {
                    case 1:
                        Z.view(Z.Alas, Z.Tinggi);
                        break;
                    case 2:
                        Z.view(Z.Alas);
                        break;
                    default:
                        System.out.println("Tidak ada dalam pilihan");
                        break;
                }
                break;
            default:
                System.out.println("Tidak ada dalam pilihan");
                break;
        }
    }
    
}
