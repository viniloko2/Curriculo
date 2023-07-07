import java.util.ArrayList;
import java.util.List;

public class Agenda {
private List<Contato> contatos;

public Agenda(){
    this.contatos = new ArrayList<>();
}

public void adicionarContato(Contato contato){
    contatos.add(contato);
}

    public List<Contato> buscar(String trecho) {
        List<Contato> encontrados = new ArrayList<>();
        for (Contato contato : contatos){
            if(contato.contemInfo(trecho)){
                encontrados.add(contato);
            }
        }
       return encontrados;
    }

}
