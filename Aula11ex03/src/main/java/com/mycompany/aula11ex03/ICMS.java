package com.mycompany.aula11ex03;

public class ICMS implements Imposto {

    @Override
    public double calcular(Orcamento o) {
        return o.getValor() * 0.12;
    }
    
}
