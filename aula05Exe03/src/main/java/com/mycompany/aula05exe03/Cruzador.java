/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula05exe03;

/**
 *
 * @author uniflcastro
 */
public class Cruzador extends NavioDeGuerra{
    protected int numCanhoes;

    public Cruzador(int numCanhoes, float blindagem, float ataque, int numTripulante, String nome) {
        super(blindagem, ataque, numTripulante, nome);
        this.numCanhoes = numCanhoes;
    }
    
    @Override
    public void ExibirArmas(){
        ExibirinfoGeral();
        System.out.println("| Blindagem : " + blindagem + " |");
    }
    
    @Override
    public void PoderDeFogo(){
        this.ExibirArmas();
        System.out.println("| Poder de Fogo: " + ataque * Math.sqrt(numCanhoes));
    }

    public int getNumCanhoes() {
        return numCanhoes;
    }

    public void setNumCanhoes(int numCanhoes) {
        this.numCanhoes = numCanhoes;
    }
    
    
}
