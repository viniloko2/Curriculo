public class Emprestimo {
    private Ferramenta ferramenta;
    private Pessoa pessoa;

    public Emprestimo(){

    }
    public Emprestimo(Ferramenta ferramenta, Pessoa nome){
        this.ferramenta = ferramenta;
        this.pessoa = pessoa;
    }
    public Ferramenta getFerramenta() {
        return ferramenta;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

}
