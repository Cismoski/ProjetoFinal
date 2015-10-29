/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

import modelo.Pessoa;

/**
 *
 * @author UTFPR
 */
public interface IReserva {

    public void reservar(Pessoa cliente, int numero, String tipo, Pessoa func);
}
