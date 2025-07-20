/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.confeitaria;

/**
 *
 * @author taina
 */

public class Confeitaria {

    public static void main(String[] args) {
        
        ColecaoDeDoces confeitaria = new ColecaoDeDoces();

        confeitaria.adicionarDoce(new Doce("Brigadeiro", 2.50));
        confeitaria.adicionarDoce(new Doce("Beijinho", 2.00));
        confeitaria.adicionarDoce(new Doce("Pudim", 3.00));

        IteradorDeDoces iterador = confeitaria.criarIterador();

        System.out.println(">> Doces disponíveis na confeitaria:");
        while (iterador.hasMore()) {
            Doce doce = iterador.getNext();
            System.out.println(doce);
        }
    }
}
