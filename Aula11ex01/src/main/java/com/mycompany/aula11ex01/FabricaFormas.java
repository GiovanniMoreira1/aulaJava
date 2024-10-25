package com.mycompany.aula11ex01;

import Formas.Circulo;
import Formas.Forma;
import Formas.Retangulo;

public class FabricaFormas {
    public Forma getForma(String tipo){
        if (tipo.equalsIgnoreCase("Retangulo")) {
            return new Retangulo();
        }else{
            if (tipo.equalsIgnoreCase("Circulo")) {
                return new Circulo();
            }else{
                return null;
            }
        }
    }
}
