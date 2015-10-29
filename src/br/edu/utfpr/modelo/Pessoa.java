/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.modelo;

/**
 *
 * @author UTFPR
 */
public class Pessoa {
    
    private String nome;
    private String sobrenome;
    private int idade;
    private int codigo;
            
    
    public Pessoa(String nome, String sobrenome, int idade,int codigo){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.codigo = codigo;
    }
    
    public String getNome(){
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public int getCodigo() {
        return codigo;
    }

 
    
    
    
}
