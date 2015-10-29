/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author UTFPR
 */
public class Gerente extends Pessoa{

    private String password;

    public Gerente(String password, String nome, int idade) {
        super(nome, idade);
        this.password = password;
    }    
}
