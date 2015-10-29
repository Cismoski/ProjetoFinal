/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import estado.Disponivel;
import estado.Status;

/**
 *
 * @author UTFPR
 */
public abstract class Quarto {
    Status e = new Disponivel();
    public abstract float custo();
    public abstract String getTipo();
    public void setEstado(Status e){
        this.e = e;
    }
    public Status getEstado(){
        return e;
    }
    public void ocupar(int numero){
        e.OcuparQuarto();
    }
}
