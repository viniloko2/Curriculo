public class Main4 {
    public static void main(String [] args){
        Geometria quadrado = new Quadrado(9);
        Geometria retangulo = new Retangulo(5, 5);
        Geometria triangulo = new Triangulo(9, 8);
        Geometria circulo = new Circulo(80.5);

        System.out.println("Area do quadrado é de: " + quadrado.calcularArea());
        System.out.println("Area do retangulo é de: " + retangulo.calcularArea());
        System.out.println("Area do triangulo é de: " + triangulo.calcularArea());
        System.out.println("Area do circulo é de: " + circulo.calcularArea());

    }
}
