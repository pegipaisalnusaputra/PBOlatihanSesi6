package bangundatar;

public class SegitigaSamaSisi extends AbstractSegitiga {
    private double sisi;

    public SegitigaSamaSisi(double sisi) {
        super(sisi, (sisi * Math.sqrt(3)) / 2);
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    public double hitungKeliling() {
        return 3 * sisi;
    }
}
