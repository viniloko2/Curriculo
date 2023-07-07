public class Main3 {
    public static void main(String[] args){
        Pessoa2 avoPai = new Pessoa2("jooa", 90);
        Pessoa2 avomae = new Pessoa2("maria", 80);

        Pessoa2 pai = new Pessoa2("josé", 50);
        Pessoa2 mae = new Pessoa2("marcia", 45);

        Pessoa2 filho = new Pessoa2("carlos" , 20);
        filho.setPai(pai);
        filho.setMae(mae);

        filho.exibirAvore();
    }
}
