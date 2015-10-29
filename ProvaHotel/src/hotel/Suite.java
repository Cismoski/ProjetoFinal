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
public class Suite extends Quarto {

    private String tipo;

    public Suite() {
    }

  

    @Override
    public float custo() {
        return 250.0f;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
