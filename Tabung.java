package bangunruang;
import bangundatar.Lingkaran;

public class Tabung extends BangunRuang {
    private double tinggi;
    
    public Tabung(Lingkaran lingkaran, double tinggi) {
        super(lingkaran);
        this.tinggi = tinggi;
    }
    
    @Override
    public double hitungVolume() {
        double jariJari = ((Lingkaran)alas).getJariJari();
        return Math.PI * Math.pow(jariJari, 2) * tinggi;
    }
    
    @Override
    public double hitungLuasPermukaan() {
        double jariJari = ((Lingkaran)alas).getJariJari();
        return (2 * Math.PI * jariJari * tinggi) + (2 * Math.PI * Math.pow(jariJari, 2));
    }
}
