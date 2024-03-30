package bangundatar;

public abstract class AbstractSegitiga implements Shape {
    protected double alas;
    protected double tinggi;

    public AbstractSegitiga (double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
}
