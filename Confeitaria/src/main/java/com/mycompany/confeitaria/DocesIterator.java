/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.confeitaria;

import java.util.List;

/**
 *
 * @author taina
 */

public class DocesIterator 
    implements IteradorDeDoces {
        
    private List<Doce> doces;
        private int indiceAtual = 0;

        public DocesIterator(List<Doce> doces) {
            this.doces = doces;
        }

        @Override
        public boolean hasMore() {
            return indiceAtual < doces.size();
        }

        @Override
        public Doce getNext() {
            return doces.get(indiceAtual++);
        } 
}
