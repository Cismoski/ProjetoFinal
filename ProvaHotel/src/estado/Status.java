/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estado;

import hotel.Hotel;

/**
 *
 * @author UTFPR
 */
public interface Status {
    public abstract void reservarQuarto(Hotel i);
    public abstract void OcuparQuarto();
    public abstract void DesocuparQuarto();
    public abstract void Pagar();
}
