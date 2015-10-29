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
public class Ocupado implements Status{
    Quarto q; 
    @Override
    public void reservarQuarto(Hotel i) {
        System.out.println("o quarto esta ocupado");
    }

    @Override
    public void OcuparQuarto() {
        System.out.println("O quarto esta sendo ocupado");
    }

    @Override
    public void DesocuparQuarto() {
        System.out.println("O quarto esta sendo desocupado");
        q.setEstado(new Disponivel());
        
    }

    @Override
    public void Pagar() {
        System.out.println("pagando");
    }
    
}
