/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.modelo;

import java.util.ArrayList;
import javax.swing.AbstractListModel;

/**
 *
 * @author Gabriel
 */
public class ListaEstoque extends AbstractListModel{
    ArrayList<Estoque> estoque = new ArrayList<>();

    public ListaEstoque() {
    }
    
    public ListaEstoque(ArrayList<Estoque> produtos){
        this.estoque = produtos;
    }
    
  

    @Override
    public int getSize() {
        return estoque.size();
    }

    @Override
    public Object getElementAt(int index) {
        return estoque.get(index);
    }

    public void setEstoque(ArrayList mostraEstoque) {
        this.estoque = mostraEstoque;
    }

    @Override
    public String toString() {
        return "ListaEstoque{" + "estoque=" + estoque + '}';
    }
    
    
    
}
