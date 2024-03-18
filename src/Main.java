public class Main {
    public static void main(String[] args) throws Exception {
        Rectangulo rectangulo1 = new Rectangulo(4,3);

        System.out.println("Valores Originales");
        System.out.println(rectangulo1.toString());
        System.out.println("\nValores Modificados");
        rectangulo1.cambiarTamanioDeDimensiones(3, 3);
        System.out.println(rectangulo1.toString());
    }
}
