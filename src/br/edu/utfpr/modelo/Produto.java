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
public class Produto {
    
    private int cod;
    private double valor;
    private String nome;

    public Produto(int cod, double valor,String nome) {
        this.cod = cod;
        this.valor = valor;
        this.nome = nome;
    }

    public int getCod() {
        return cod;
    }

    public double getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }
    
 
    
}
