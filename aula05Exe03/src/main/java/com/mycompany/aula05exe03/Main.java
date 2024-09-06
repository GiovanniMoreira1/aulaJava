/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula05exe03;

/**
 *
 * @author uniflcastro
 */
public class Main {
    public static void main(String[] args) {
        Navio n = new Navio(5, "Teste navio");
        NavioDeGuerra ng = new NavioDeGuerra((float) 3.2, (float) 4.1, 5, "Teste navio de guerra");
        NavioMercante nm = new NavioMercante((float) 5.5, (float) 8.2, 5, "Teste navio mercante");
        Cruzador c = new Cruzador(2, (float) 4.1, (float) 5.5, 5, "Teste cruzador");
        PortaAvioes pa = new PortaAvioes(2, (float) 3.2, (float) 8.2, 5, "Teste Porta-Aviões");
        
        System.out.println("Navio: ");
        n.ExibirinfoGeral();
        System.out.println("Navio de Guerra: ");
        ng.PoderDeFogo();
        ng.ExibirArmas();
        System.out.println("Navio Mercante: ");
        nm.Carregamento();
        System.out.println("Cruzador: ");
        c.PoderDeFogo();
        System.out.println("Porta-Aviões");
        pa.PoderDeFogo();
    }
    
    
}
