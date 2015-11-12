package br.edu.utfpr.modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Gabriel
 */
public class Pessoa {
    
    private String nome;
    private String sobrenome;
    private String endereco;
    private int cod;
    
    public Pessoa(String nome,String sobrenome,String endereco,int cod){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.endereco = endereco;
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getCod() {
        return cod;
    }

    
    
}
