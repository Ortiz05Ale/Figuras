public abstract class Figura {
    private int numeroDeLados;

    public Figura(){

    }

    public Figura(int numeroDeLados){
        this.numeroDeLados = numeroDeLados;
    }

    public int getNumeroDeLados() {
        return numeroDeLados;
    }
    public abstract int getPerimetro();
    
    public abstract int getArea();
}
