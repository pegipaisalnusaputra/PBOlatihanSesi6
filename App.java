import bangundatar.Lingkaran;
import bangundatar.Persegi;
import bangundatar.PersegiPanjang;
import bangundatar.SegitigaSamaKaki;
import bangunruang.Balok;
import bangunruang.Bola;
import bangunruang.Kubus;
import bangunruang.Tabung;

public class App {
    public static void main(String[] args) {
        PersegiPanjang persegiPanjang = new PersegiPanjang(5, 3);
        System.out.println("Luas Persegi Panjang: " + persegiPanjang.hitungLuas());
        System.out.println("Keliling Persegi Panjang: " + persegiPanjang.hitungKeliling());

        Persegi persegi = new Persegi(4);
        System.out.println("Luas Persegi: " + persegi.hitungLuas());
        System.out.println("Keliling Persegi: " + persegi.hitungKeliling());

        Lingkaran lingkaran = new Lingkaran(7);
        System.out.println("Luas Lingkaran: " + lingkaran.hitungLuas());
        System.out.println("Keliling Lingkaran: " + lingkaran.hitungKeliling());

        SegitigaSamaKaki samaKakiSegitiga = new SegitigaSamaKaki(4, 3, 5);
        System.out.println("Luas Segitiga Sama Kaki: " + samaKakiSegitiga.hitungLuas());
        System.out.println("Keliling Segitiga Sama Kaki: " + samaKakiSegitiga.hitungKeliling());

        // Contoh penggunaan untuk bangun ruang
        Kubus kubus = new Kubus(persegi);
        System.out.println("Volume Kubus: " + kubus.hitungVolume());
        System.out.println("Luas Permukaan Kubus: " + kubus.hitungLuasPermukaan());

        Balok balok = new Balok(persegiPanjang, 7);
        System.out.println("Volume Balok: " + balok.hitungVolume());
        System.out.println("Luas Permukaan Balok: " + balok.hitungLuasPermukaan());

        Bola bola = new Bola(lingkaran);
        System.out.println("Volume Bola: " + bola.hitungVolume());
        System.out.println("Luas Permukaan Bola: " + bola.hitungLuasPermukaan());

        Tabung tabung = new Tabung(lingkaran, 10);
        System.out.println("Volume Tabung: " + tabung.hitungVolume());
        System.out.println("Luas Permukaan Tabung: " + tabung.hitungLuasPermukaan());
    }
}

