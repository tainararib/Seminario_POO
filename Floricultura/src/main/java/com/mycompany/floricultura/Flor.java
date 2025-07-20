/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.floricultura;

/**
 *
 * @author taina
 */

public abstract class Flor {
    private Vaso vaso;

    public Flor(Vaso vaso) {
        this.vaso = vaso;
    }

    protected Vaso getVaso() {
        return vaso;
    }
    
    public abstract void exibir();
}
