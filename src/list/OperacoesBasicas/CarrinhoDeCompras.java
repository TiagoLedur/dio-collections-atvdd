package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

        private List<Item> carrinho;

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int qtde){
        carrinho.add(new Item(nome, preco, qtde));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        for(Item i : carrinho){
            if(i.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            }
        }
        carrinho.removeAll(itensParaRemover);
    }

    String calcularValorTotal(){
        double valorTotal = 0.0;
        double valor;

        for(Item i : carrinho){
            valor = (i.getPreco() * i.getQtde());
            valorTotal += valor;
        }
        String valorFormatado = String.format("%.2f", valorTotal);

        return valorFormatado;
    }

    public void exibirItens(){
        for(Item i : carrinho){
            System.out.println("Produto: "+i.getNome());
            System.out.println("Preço: "+i.getPreco());
            System.out.println("Quantidade: "+i.getQtde()+"\n");
        }
    }

    public static void main(String[] args) {

        CarrinhoDeCompras carrinhoCompra = new CarrinhoDeCompras();

        carrinhoCompra.adicionarItem("Banana", 3.0, 2);
        carrinhoCompra.adicionarItem("Maca", 5.0, 3);
        carrinhoCompra.adicionarItem("Abacaxi", 8.0, 4);
        carrinhoCompra.adicionarItem("Roma", 10.0, 1);

        carrinhoCompra.exibirItens();

        carrinhoCompra.removerItem("Roma");

        carrinhoCompra.exibirItens();

        System.out.println("Valor total do carrinho: "+carrinhoCompra.calcularValorTotal());
    }

}
