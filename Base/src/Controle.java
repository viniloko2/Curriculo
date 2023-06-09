public interface Controle {
    // Método para doar um livro para o estoque da biblioteca
    void doar(Livro livro);

    // Método para emprestar um livro para um usuário
    void emprestar(Livro livro, Usuario usuario);

    // Método para devolver um livro à biblioteca
    void devolver(Livro livro, Usuario usuario);

    // Método para pagar a multa de um usuário
    void pagarMulta(Usuario usuario);
}