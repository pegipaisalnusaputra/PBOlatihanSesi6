package bangundatar;

public class SegitigaSamaKaki extends AbstractSegitiga {
    private double sisiMiring;

    public SegitigaSamaKaki(double alas, double tinggi, double sisiMiring) {
        super (alas, tinggi);
        this.sisiMiring = sisiMiring;
    }

    @Override
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    public double hitungKeliling() {
        return 2 * alas + sisiMiring;
    }
}
