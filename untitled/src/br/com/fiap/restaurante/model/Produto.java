package br.com.fiap.restaurante.model;

//abstract faz com que eu nao consiga instanciar a classe produto
public abstract class Produto {
    //atributos
    private String nome;
    private String ingredientes;
    private Double preco;


    //metodos
    public Produto() {
    }

    public Produto(String nome, String ingredientes, Double preco) {
        this.nome = nome;
        this.ingredientes = ingredientes;
        this.preco = preco;
    }


    //metodo abstrato:
    public abstract String getResumo();


    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}