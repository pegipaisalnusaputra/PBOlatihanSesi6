package bangunruang;
import bangundatar.PersegiPanjang;

public class Balok extends BangunRuang {
    private double tinggi;
    
    public Balok(PersegiPanjang persegiPanjang, double tinggi) {
        super(persegiPanjang);
        this.tinggi = tinggi;
    }
    
    @Override
    public double hitungVolume() {
        double luasAlas = alas.hitungLuas();
        return luasAlas * tinggi;
    }
    
    @Override
    public double hitungLuasPermukaan() {
        double luasAlas = alas.hitungLuas();
        double kelilingAlas = alas.hitungKeliling();
        return 2 * luasAlas + kelilingAlas * tinggi;
    }
}
