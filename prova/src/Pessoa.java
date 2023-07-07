import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private List<Emprestimo> emprest;

    public Pessoa(){

    }
    public Pessoa(String nome){
        this.nome = nome;
        this.emprest = new ArrayList<>();
    }
    public String getNome() {
        return nome;
    }

    public List<Emprestimo> getEmprest() {
        return emprest;
    }
public void adicionarEmprestimo(Emprestimo emprestimo){
        emprest.add(emprestimo);
}

}
