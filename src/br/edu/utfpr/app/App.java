/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.app;

import br.edu.utfpr.dao.Dao;
import br.edu.utfpr.dao.DaoDerby;

import br.edu.utfpr.modelo.Pessoa;

/**
 *
 * @author UTFPR
 */
public class App {
    
    public static void main(String[] args) {
        
  
        Pessoa pedro = new Pessoa("Pedro","Silva","Casa",5);
        Dao dao = new DaoDerby();
        
      
      //dao.adicionar(pedro);  
      // dao.listarTudo();
  
    }
    
}
