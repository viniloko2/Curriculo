import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args){
        Ferramenta ferramenta1 = new Ferramenta("martelo");
        Ferramenta ferramenta2 = new Ferramenta("marreta");

        Pessoa pessoa1 = new Pessoa("marcao");
        Pessoa pessoa2 = new Pessoa("jose");

        Emprestimo emprestimo1 = new Emprestimo(ferramenta1, pessoa2);
        ferramenta1.emprestar();
        pessoa2.adicionarEmprestimo(emprestimo1);
        Emprestimo emprestimo2 = new Emprestimo(ferramenta2, pessoa1);
ferramenta2.isEmprestada();
pessoa1.adicionarEmprestimo(emprestimo2);

        List<Ferramenta> ferramentas = new ArrayList<>();
        ferramentas.add(ferramenta1);
        ferramentas.add(ferramenta2);

        Relatorio.EmprestimoFerramentas(ferramentas);

    }
}
