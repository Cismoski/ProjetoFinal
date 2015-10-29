/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import Proxy.HotelProxy;
import decorator.Colchao;
import decorator.DecoratorHotel;
import hotel.Hotel;
import modelo.Cliente;
import modelo.Gerente;
import modelo.Pessoa;

/**
 *
 * @author UTFPR
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa gerente = new Gerente("1234", "jose", 30);
        Pessoa cliente = new Cliente("paulo", 20);
        HotelProxy hp = new HotelProxy();
        
        
                //cliente, quarto, tipo, funcionario;
        hp.reservar(cliente, 0, "Duplo",gerente);
        hp.reservar(gerente, 0, "Duplo",gerente);
        hp.reservar(gerente, 1, "Duplo",gerente);
        hp.reservar(gerente, 5, "Duplo",cliente);
        
    }

}
