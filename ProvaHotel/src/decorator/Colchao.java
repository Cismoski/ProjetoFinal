/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import hotel.Hotel;
import hotel.Quarto;

/**
 *
 * @author UTFPR
 */
public class Colchao extends DecoratorHotel {

    Quarto x;

    public Colchao(Quarto x) {
        this.x = x;
    }

    public Colchao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float custo() {
        return (this.x.custo() + 35.0f);
    }

    @Override
    public String getTipo() {
        return (this.x.getTipo() + " com colchao.");
    }

}
