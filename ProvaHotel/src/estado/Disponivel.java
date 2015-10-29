/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estado;

import hotel.Hotel;
import hotel.Quarto;

/**
 *
 * @author UTFPR
 */
public class Disponivel implements Status{
    
    Quarto q;

    @Override
    public void reservarQuarto(Hotel i) {
        System.out.println("reservando quarto");
        q.setEstado(new Ocupado());       
    }

    @Override
    public void OcuparQuarto() {
        System.out.println("o quarto precisa ser reservado primeiramente");
    }

    @Override
    public void DesocuparQuarto() {
        System.out.println("o quarto ja esta desoucupado");
    }

    @Override
    public void Pagar() {
        System.out.println("o quarto ainda nao foi utilizado");
    }
    
}
