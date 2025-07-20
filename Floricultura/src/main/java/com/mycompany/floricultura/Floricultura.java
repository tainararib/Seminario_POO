/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.floricultura;

/**
 *
 * @author taina
 */

public class Floricultura {

    public static void main(String[] args) {
        Vaso vasoVidro = new VasoVidro();
        Vaso vasoCeramica = new VasoCeramica();

        Flor rosaEmVidro = new Rosa(vasoVidro);
        Flor rosaEmCeramica = new Rosa(vasoCeramica);
        Flor lirioEmVidro = new Lirio(vasoVidro);

        rosaEmVidro.exibir();       
        rosaEmCeramica.exibir();    
        lirioEmVidro.exibir();      
    }
}
