import java.util.List;

public class Relatorio {
    public static void EmprestimoFerramentas(List<Ferramenta> ferramentas){
        System.out.println("ferramentas emprestadas: ");
        for (Ferramenta ferramenta : ferramentas){
            if (ferramenta.isEmprestada()){
                System.out.println(ferramenta.getNome());
            }
        }
    }
}
