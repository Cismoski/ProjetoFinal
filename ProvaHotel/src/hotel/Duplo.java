/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

/**
 *
 * @author UTFPR
 */
public class Duplo extends Quarto {

    private String tipo;

    public Duplo() {
    }

    

    @Override
    public float custo() {
        return 200.0f;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
