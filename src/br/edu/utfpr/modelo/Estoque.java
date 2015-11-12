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
public class Estoque {
    
    private String cod;
    private String nome;
    private String quantidade;
    
    public Estoque(){
        
    }

    public Estoque(String cod, String quantidade, String nome) {
        this.cod = cod;
        this.quantidade = quantidade;
        this.nome = nome;
    }

    public String getCod() {
        return cod;
    }

    @Override
    public String toString() {
        return "Codigo: " + cod + "     Nome: " + nome + "      Quantidade: " + quantidade ;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public String getNome() {
        return nome;
    }
}
