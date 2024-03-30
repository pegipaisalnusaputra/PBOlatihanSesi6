package bangunruang;
import bangundatar.Lingkaran;

public class Bola extends BangunRuang {
    public Bola(Lingkaran lingkaran) {
        super(lingkaran);
    }
    
    @Override
    public double hitungVolume() {
        double jariJari = ((Lingkaran)alas).getJariJari();
        return (4.0/3.0) * Math.PI * Math.pow(jariJari, 3);
    }
    
    @Override
    public double hitungLuasPermukaan() {
        double jariJari = ((Lingkaran)alas).getJariJari();
        return 4 * Math.PI * Math.pow(jariJari, 2);
    }
}
