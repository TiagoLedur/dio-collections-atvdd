package list.OperacoesBasicas;

public class Item {

    private String nome;
    private double preco;
    private int qtde;

    public Item(int qtde) {
        this.qtde = qtde;
    }

    public Item(double preco) {
        this.preco = preco;
    }

    public Item(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Item(String nome, double preco, int qtde) {
        this.nome = nome;
        this.preco = preco;
        this.qtde = qtde;
    }

    public double getPreco() {
        return preco;
    }

    public int getQtde() {
        return qtde;
    }
}
