/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import hotel.Quarto;

/**
 *
 * @author UTFPR
 */
public class Frigobar extends DecoratorHotel{
        Quarto x;

    public Frigobar(Quarto x) {
        this.x = x;
    }

    @Override
    public float custo() {
        return (this.x.custo() + 50.0f);
    }

    @Override
    public String getTipo() {
        return (this.x.getTipo() + " com frigobar.");
    }
}
