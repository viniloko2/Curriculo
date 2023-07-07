public class Ferramenta {
    private String nome;
    private boolean emprestada;

    public Ferramenta(){

    }
    public Ferramenta(String nome){
        this.nome = nome;
        this.emprestada = false;
    }
    public String getNome() {
        return nome;
    }

    public boolean isEmprestada() {
        return emprestada;
    }

    public void emprestar() {
        this.emprestada = true;
    }

    public void devolver() {
        this.emprestada = false;
    }
}
