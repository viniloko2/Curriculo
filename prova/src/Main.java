import java.util.List;

public class Main {
    public static void main(String[] args){
        Agenda agenda = new Agenda();

        Contato contato1 = new Contato("denis");
        contato1.adicionarEmail("denisgalinha@gmail.com");
        contato1.adicionarTelefone("12345");
        contato1.adicionarTelefone("987654321");
        contato1.setEnderecoComercial("rua sao paulo, 123");
        contato1.setEnderecoResidencial("gleba palhano, 321");

        Contato contato2 = new Contato("paulo");
        contato2.adicionarEmail("paulogalo@gmail.com");
        contato2.adicionarTelefone("22222");
        contato2.adicionarTelefone("333333");
        contato2.setEnderecoComercial("rua londrina, 111");
        contato2.setEnderecoResidencial("gleba palinha, 222");

        agenda.adicionarContato(contato1);
        agenda.adicionarContato(contato2);

        List<Contato> encontrados = agenda.buscar("222");
        if (!encontrados.isEmpty()){
            for (Contato contato : encontrados){
                System.out.println(contato);
                System.out.println();
            }
        }else {
            System.out.println("nao achei");
        }
    }
}
