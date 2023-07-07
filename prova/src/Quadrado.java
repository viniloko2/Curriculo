public class Quadrado extends Geometria {
private double lado;

public Quadrado(){

}
public Quadrado(double lado){
    this.lado = lado;
}
    public double getLado() {
        return lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
