public class Triangulo extends Figura{
    private int anchura;
    private int altura;

    Triangulo(){

    }

    Triangulo(int anchura, int altura){
        this.anchura = anchura;
        this.altura = altura;
    }

    public int getAnchura() {
        return anchura;
    }

    public void setAnchura(int anchura) {
        this.anchura = anchura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public int getPerimetro(){
        return (altura * 2) +  anchura ;
    }

    @Override
    public int getArea(){
        return (anchura * altura/2);
    }

    @Override
    public String toString() {
        return "Perímetro: " + getPerimetro() + "\nÁrea: " + getArea();
    }
}
