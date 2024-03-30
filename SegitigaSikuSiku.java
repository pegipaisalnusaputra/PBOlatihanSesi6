package bangundatar;

public class SegitigaSikuSiku extends AbstractSegitiga {
    private double sisiMiring;

    public SegitigaSikuSiku(double alas, double tinggi, double sisiMiring){
        super(alas, tinggi);
        this.sisiMiring = sisiMiring;
    }

    @Override
    public double hitungLuas(){
        return 0.5 * alas * tinggi;

    }

    @Override
    public double hitungKeliling() {
        return alas + tinggi + sisiMiring;
    }
}
