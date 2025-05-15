package br.com.fiap.restaurante.model;

public class PratoQuente extends Produto {
    //atributo individual acrescentado p prato quente
    private int serve;


    //metodos
    public PratoQuente() {
        super();
    }

    public PratoQuente(String nome, String ingredientes, Double preco, int serve) {
        super(nome, ingredientes, preco);
        this.serve = serve;
    }

    public String getResumo() {
        return "Nome: " + this.getNome() + " Ingredientes: " + this.getIngredientes() + " Preco: R$" + this.getPreco() + " Serve: " + this.getServe() + "pessoas";
    }



    //metodo get/set individual acrescentado p prato quente
    public int getServe() {
        return serve;
    }

    public void setServe(int serve) {
        this.serve = serve;
    }
}