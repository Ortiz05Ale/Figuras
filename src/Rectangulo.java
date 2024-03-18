public class Rectangulo extends Figura implements IRedimencionar {
    private int anchura;
    private int altura;
    
    public Rectangulo(){
        
    }

    public Rectangulo(int anchura, int altura){
        this.anchura = anchura;
        this.altura = altura;
    }

    public int getAnchura(){
        return anchura;
    }

    public void setAnchura(int anchura){
        this.anchura = anchura;
    }

    public int getAltura(){
        return altura;
    }

    public void setAltura(int altura){
        this.altura = altura;
    }

    @Override
    public int getPerimetro(){
        return (anchura + altura) * 2;
    }

    @Override
    public int getArea(){
        return anchura * altura;
    }

    @Override
    public void cambiarTamanioDeDimensiones(int anchura, int altura){
        this.anchura = anchura;
        this.altura = altura;
    }
    @Override
    public String toString() {
        return "Perímetro: " + getPerimetro() + "\nÁrea: " + getArea();
    }
}
