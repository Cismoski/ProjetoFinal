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
public abstract class DecoratorHotel extends Quarto{

    @Override
    public abstract float custo();

    @Override
    public abstract String getTipo();
    
}
