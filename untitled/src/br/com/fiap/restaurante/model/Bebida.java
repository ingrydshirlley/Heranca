package br.com.fiap.restaurante.model;

//extends produto p herdar os metodos e atributos
public class Bebida extends Produto {
    //atributo individual acrescentado p bebida
    private int quantidade;


    //metodos
    public Bebida() {
        super();
    }

    public Bebida(String nome, String ingredientes, Double preco, int quantidade) {
        super(nome, ingredientes, preco);
        this.quantidade = quantidade;
    }

    public String getResumo() {
        return "Nome: " + this.getNome() + " Ingredientes: " + this.getIngredientes() + " Preco: R$" + this.getPreco() + " Quantidade: " + this.getQuantidade() + "ml";
    }


    //metodo get/set individual acrescentado p bebida
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}

