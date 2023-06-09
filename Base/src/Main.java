public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("Livro 1", "Autor 1");
        Livro livro2 = new Livro("Livro 2", "Autor 2");

        Usuario usuario1 = new Usuario("Usuário 1");
        Usuario usuario2 = new Usuario("Usuário 2");

        biblioteca.doar(livro1);
        biblioteca.doar(livro2);

        biblioteca.emprestar(livro1, usuario1);
        biblioteca.emprestar(livro2, usuario2);

        biblioteca.incrementarContadorDias(); // Simulação de avanço de 1 dia
        biblioteca.devolver(livro1, usuario1);
        biblioteca.incrementarContadorDias(); // Simulação de avanço de 1 dia
        biblioteca.devolver(livro2, usuario2);

        biblioteca.devolver(livro1, usuario1);

        biblioteca.pagarMulta(usuario1);
        biblioteca.pagarMulta(usuario2);
    }
}