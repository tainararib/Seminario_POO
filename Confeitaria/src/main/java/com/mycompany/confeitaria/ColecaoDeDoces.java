/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.confeitaria;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author taina
 */

public class ColecaoDeDoces {
    
    private List<Doce> doces = new ArrayList<>();

    public void adicionarDoce(Doce doce) {
        doces.add(doce);
    }

    public IteradorDeDoces criarIterador() {
        return new DocesIterator(doces);
    }
}
