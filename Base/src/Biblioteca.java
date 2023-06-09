import java.util.ArrayList;

public class Biblioteca implements Controle {
    private ArrayList<Livro> livros = new Arraylist<>();
    private ArrayList<Usuario> user = new Arraylist<>();
    private int contadorDias;
    private int Atraso;

    public Biblioteca() {
    }

    // Implementação do método doar da interface Controle
    @Override
    public void doar(Livro livro) {
        livros.add(livro);
        System.out.println("Livro doado: " + livro.getTitulo());
    }

    // Implementação do método emprestar da interface Controle
    @Override
    public void emprestar(Livro livro, Usuario usuario) {
        if (livro.isEmprestado()) {
            System.out.println("Livro já emprestado.");
        } else {
            livro.setEmprestado(true);
            System.out.println("Livro emprestado: " + livro.getTitulo() + " - Empréstimo para: " + usuario.getNome());
        }
    }

    // Implementação do método devolver da interface Controle
    @Override
    public void devolver(Livro livro, Usuario usuario) {
        if (!livro.isEmprestado()) {
            System.out.println("Livro não estava emprestado.");
        } else {
            livro.setEmprestado(false);
            Atraso = contadorDias - 7; // Verifica se houve atraso na devolução
        }
            if (diasAtraso > 0) {
                int multa = Atraso * 2; // Cada dia de atraso tem multa de R$ 2
                usuario.setMulta(usuario.getMulta() + multa);
                System.out.println("Livro devolvido com atraso de " + Atraso + " dias. Multa aplicada: R$ " + multa);
            } else {
                System.out.println("Livro devolvido: " + livro.getTitulo() + " - Devolvido por: " + usuario.getNome());
            }
        }
    

    // Implementação do método pagarMulta da interface Controle
    @Override
    public void pagarMulta(Usuario usuario) {
        int multa = usuario.getMulta();
        if (multa > 0) {
            usuario.setMulta(0);
            System.out.println("Multa paga por: " + usuario.getNome() + ". Valor pago: R$ " + multa);
        } else {
            System.out.println("Não há multa a ser paga para: " + usuario.getNome());
        }
    }

    // Método para incrementar o contador de dias
    public void incrementarContadorDias() {
        contadorDias++;
    }
}