package com.mycompany.aula11ex01;

import Formas.Forma;

public class SympleFctory {
    public static void main(String[] args) {
        FabricaFormas ff = new FabricaFormas();
        Forma forma;
        
        forma = ff.getForma("Retangulo");
        forma.desenhar();
        forma = ff.getForma("Circulo");
        forma.desenhar();
    }
}
