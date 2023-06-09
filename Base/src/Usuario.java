public class Usuario {
    private String nome;
    private int multa;

    public Usuario(String nome) {
        this.nome = nome;
        this.multa = 0;
    }

    // Getters e setters

    public String getNome() {
        return nome;
    }

    public int getMulta() {
        return multa;
    }

    public void setMulta(int multa) {
        this.multa = multa;
    }
}