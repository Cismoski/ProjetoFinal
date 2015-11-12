/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.modelo;

/**
 *
 * @author Gabriel
 */
public class Item {

    private int cod_produto;
    private int quantidade;

    public Item(int cod_produto, int quantidade) {

        this.cod_produto = cod_produto;
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int getCod() {
        return cod_produto;
    }


}
