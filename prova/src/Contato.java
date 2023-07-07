import java.util.ArrayList;
import java.util.List;

public class Contato {
    private String nome;
    private List<String> emails;
    private List<String> telefones;
    private String enderecoComercial;
    private String enderecoResidencial;

    public Contato(){

    }
    public Contato(String nome){
        this.nome = nome;
        this.emails = new ArrayList<>();
        this.telefones = new ArrayList<>();
    }
    public String getNome() {
        return nome;
    }

    public void adicionarEmail(String email) {
        emails.add(email);
    }

    public void adicionarTelefone(String telefone) {
        telefones.add(telefone);
    }

    public void setEnderecoComercial(String enderecoComercial) {
        this.enderecoComercial = enderecoComercial;
    }

    public void setEnderecoResidencial(String enderecoResidencial) {
        this.enderecoResidencial = enderecoResidencial;
    }
    public boolean contemInfo(String trecho){
        return nome.contains(trecho) || telefones.stream().anyMatch(emails -> emails.contains(trecho)) ||
                (enderecoComercial != null && enderecoComercial.contains(trecho)) || (enderecoResidencial != null &&
                enderecoResidencial.contains(trecho));
    }
    public String toString(){
        return "nome: " + nome + "\n emails: "  + emails + "\n telefones" + telefones + "\n endereco comercial" + enderecoComercial + "\n endereco residencial: " +
                enderecoResidencial;
    }
}
