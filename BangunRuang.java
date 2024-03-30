package bangunruang;
import bangundatar.Shape;

public abstract class BangunRuang implements Geometri {
    protected Shape alas;
    
    public BangunRuang(Shape alas) {
        this.alas = alas;
    }
}
