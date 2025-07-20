/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.confeitaria;

/**
 *
 * @author taina
 */

public class Doce {
    
    private String nome;
    private double preco;

    public Doce(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    //<editor-fold defaultstate="collapsed" desc="Getters">
    
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    //</editor-fold>
    
    @Override
    public String toString() {
        return nome + " - R$ " + preco;
    }
}
