/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.floricultura;

/**
 *
 * @author taina
 */

public class Lirio extends Flor {
    public Lirio(Vaso vaso) {
        super(vaso);
    }

    @Override
    public void exibir() {
        System.out.print(">> Lírio ");
        getVaso().exibir();
    } 
}
