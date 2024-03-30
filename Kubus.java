package bangunruang;
import bangundatar.Persegi;

public class Kubus extends BangunRuang {
    public Kubus(Persegi persegi) {
        super(persegi);
    }
    
    @Override
    public double hitungVolume() {
        double sisi = ((Persegi)alas).getSisi();
        return sisi * sisi * sisi;
    }
    
    @Override
    public double hitungLuasPermukaan() {
        double sisi = ((Persegi)alas).getSisi();
        return 6 * sisi * sisi;
    }
}
