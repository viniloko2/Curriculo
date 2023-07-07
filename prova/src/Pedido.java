import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ItemPedido> itens;

    public Pedido() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        for (ItemPedido item : itens) {
            Produto produto = item.getProduto();
            int quantidade = item.getQuantidade();
            valorTotal += produto.getPreco() * quantidade;
        }
        return valorTotal;
    }

    public double calcularValorImpostos() {
        double valorImpostos = 0;
        for (ItemPedido item : itens) {
            Produto produto = item.getProduto();
            int quantidade = item.getQuantidade();
            valorImpostos += produto.calcularImposto(quantidade);
        }
        return valorImpostos;
    }
}
