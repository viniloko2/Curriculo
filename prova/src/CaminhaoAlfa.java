public class CaminhaoAlfa extends Caminhao{
public CaminhaoAlfa(){
    super(5000);
}
    public void inserirPluvi(Pluviometro pluviometro){
if (pluviometro.getPeso() <= capacidade){
    System.out.println("pluviometro" + pluviometro.getTipo() + "Inserido no caminhao");
} else{
    System.out.println("caminhao nao suporta o peso" + pluviometro.getTipo());
}
    }
}
