public class Retangulo extends Geometria{
    private double largura;
    private double altura;

public Retangulo(){

}
    public Retangulo(double largura, double altura){
this.altura = altura;
this.largura = largura;
    }
    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }
}
