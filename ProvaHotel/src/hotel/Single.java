/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import java.util.ArrayList;

/**
 *
 * @author UTFPR
 */
public class Single extends Quarto {

    private String tipo;

    public Single() {
    }

   

    @Override
    public float custo() {
        return 150.0f;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
