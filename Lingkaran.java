package bangundatar;

public class Lingkaran implements Shape {
    private double jariJari;
    
        public Lingkaran (double jariJari) {
            this.jariJari = jariJari;
        }

        public double getJariJari() {
            return jariJari;
        }
    
        @Override
        public double hitungLuas() {
            return Math.PI *jariJari *jariJari;
        }

        @Override
        public double hitungKeliling() {
            return 2 * Math.PI * jariJari;
        }
    
}

