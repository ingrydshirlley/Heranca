package br.com.fiap.restaurante.view;

import br.com.fiap.restaurante.model.Bebida;
import br.com.fiap.restaurante.model.PratoQuente;

public class TesteHeranca {
    public static void main(String[] args) {
        Bebida bebida = new Bebida("suco de laranja", "agua, laranja, acucar e gelo", 10.0, 250);
        System.out.println("-------- bebida --------");
        System.out.println("nome = " + bebida.getNome());
        System.out.println("ingredientes = " + bebida.getIngredientes());
        System.out.println("preço = " + bebida.getPreco());
        System.out.println("quantidade = " + bebida.getQuantidade() + " ml");
        System.out.println(bebida.getResumo());

        System.out.println(" ");

        PratoQuente prato = new PratoQuente();
        prato.setNome("omelete");
        prato.setIngredientes("ovo, tomate e queijo");
        prato.setPreco(15.5);
        prato.setServe(1);
        System.out.println("-------- prato --------");
        System.out.println("nome = " + prato.getNome());
        System.out.println("ingredientes = " + prato.getIngredientes());
        System.out.println("preço = " + prato.getPreco());
        System.out.println("serve = " + prato.getServe() + " pessoas");
        System.out.println(prato.getResumo());

    }
}
