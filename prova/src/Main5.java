public class Main5 {
    public static void main(String[] args){
        Pluviometro pluviometro = new Pluviometro("tipo1");
        Pluviometro pluviometro2 = new Pluviometro("tipo2");

        CaminhaoAlfa caminhaoAlfa = new CaminhaoAlfa();
        caminhaoAlfa.inserirPluvi(pluviometro);
        caminhaoAlfa.inserirPluvi(pluviometro2);

        CaminhaoBeta caminhaoBeta = new CaminhaoBeta();
        caminhaoBeta.inserirPluvi(pluviometro);
        caminhaoBeta.inserirPluvi(pluviometro2);
    }
}
