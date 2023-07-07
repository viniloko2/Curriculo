public class Circulo extends Geometria {
private double raio;

public Circulo(){

}
    public Circulo(double raio){
this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
