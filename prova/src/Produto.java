public class Produto {
    private String nome;
    private double preco;
    private double aliquotaImposto;
    private int estoque;

    public Produto(String nome, double preco, double aliquotaImposto, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.aliquotaImposto = aliquotaImposto;
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double getAliquotaImposto() {
        return aliquotaImposto;
    }

    public int getEstoque() {
        return estoque;
    }

    public double calcularImposto(int quantidade) {
        return preco * aliquotaImposto * quantidade;
    }
}
