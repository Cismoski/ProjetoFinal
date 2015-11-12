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
public class Venda {
    private int cod_venda;
    private int cod_pessoa;
    private int cod_itens;

    public Venda(int cod_venda, int cod_pessoa, int cod_itens) {
        this.cod_venda = cod_venda;
        this.cod_pessoa = cod_pessoa;
        this.cod_itens = cod_itens;
    }

    public int getCod_venda() {
        return cod_venda;
    }

    public int getCod_pessoa() {
        return cod_pessoa;
    }

    public int getCod_itens() {
        return cod_itens;
    }
   
    
    
}
