/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

import hotel.Hotel;
import modelo.Gerente;
import modelo.Pessoa;

/**
 *
 * @author UTFPR
 */
public class HotelProxy implements IReserva {

    Hotel hotel1 = new Hotel();

    @Override
    public void reservar(Pessoa cliente, int numero, String tipo, Pessoa func) {
        if (func instanceof Gerente) {
            hotel1.reservar(cliente, numero, tipo);
        } else {
            System.out.println("nao é um funcionario que esta fazendo a reserva");
        }
    }
}
