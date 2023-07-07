public class CaminhaoBeta extends Caminhao{
    private int quantidadePluvi;

    public CaminhaoBeta(){

    }
    public CaminhaoBeta(int quantidadePluvi){
        super(Integer.MAX_VALUE);
        this.quantidadePluvi = 0;
    }
    public int getQuantidadePluvi(){
        return quantidadePluvi;
    }
    public void inserirPluvi(Pluviometro pluviometro){
        if (pluviometro.getPeso() <= capacidade && quantidadePluvi == 0){
            System.out.println("pluviometro" + pluviometro.getTipo() + "Inserido no caminhao");
            quantidadePluvi ++;
        } else{
            System.out.println("caminhao nao suporta o peso" + pluviometro.getTipo());
        }
    }
}
