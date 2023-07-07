public class Pessoa2 {
    private String nome;
    private int idade;
    private Pessoa2 pai;
    private Pessoa2 mae;

    public Pessoa2(){

    }
    public Pessoa2(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Pessoa2 getPai() {
        return pai;
    }

    public Pessoa2 getMae() {
        return mae;
    }

    public void setPai(Pessoa2 pai) {
        this.pai = pai;
    }

    public void setMae(Pessoa2 mae) {
        this.mae = mae;
    }

    public void exibirAvore(){
        System.out.println("nome: " + nome + "idade: " + idade);
        if (pai != null){
            System.out.println("pai: " + getPai());
        }
        if (mae != null){
            System.out.println("mae: " + getMae());
        }
    }
}
