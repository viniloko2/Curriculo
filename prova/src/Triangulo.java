public class Triangulo extends Geometria {
private double base;
private  double altura;

public Triangulo(){

}
    public Triangulo(double base, double altura){
        this.base = base;
    this.altura = altura;

    }
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}
