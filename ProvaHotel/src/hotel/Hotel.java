/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import decorator.DecoratorHotel;
import estado.Disponivel;
import estado.Ocupado;
import java.util.ArrayList;
import modelo.Pessoa;

/**
 *
 * @author UTFPR
 */
public class Hotel {

    private int numDeQuartos;
    ArrayList<Quarto> quartos;
    DecoratorHotel dh;
    public Hotel() {
        quartos = new ArrayList();
        adicionarQuartos();
    }

    public void adicionarQuartos() {
        quartos.add(new Duplo());
        quartos.add(new Duplo());
        quartos.add(new Single());
        quartos.add(new Single());
        quartos.add(new Suite());
        quartos.add(new Suite());
    }

    public void reservar(Pessoa c, int numero, String tipo) {
        if (tipo.equals("Duplo")) {
            if (quartos.get(numero) instanceof Duplo) {
                if (quartos.get(numero).getEstado() instanceof Disponivel) {
                    quartos.get(numero).setEstado(new Ocupado());
                    System.out.println("reservado duplo");
                } else {
                    System.out.println("quarto ja esta reservado");
                }
            }else {
                System.out.println("nao é duplo");
            }
        }
        if (tipo.equals("Single")) {
            if (quartos.get(numero) instanceof Single) {
                if (quartos.get(numero).getEstado() instanceof Disponivel) {
                    quartos.get(numero).setEstado(new Ocupado());
                    System.out.println("reservado single");
                } else {
                    System.out.println("quarto ja esta reservado");
                }
            }else{
                System.out.println("nao é single");
            }
        }
        if (tipo.equals("Suite")) {
            if (quartos.get(numero) instanceof Suite) {
                if (quartos.get(numero).getEstado() instanceof Disponivel) {
                    quartos.get(numero).setEstado(new Ocupado());
                    System.out.println("reservado suite");
                } else {
                    System.out.println("quarto ja esta reservado");
                }
            }else{
                System.out.println("nao é suite");
            }
        }
    }
}
