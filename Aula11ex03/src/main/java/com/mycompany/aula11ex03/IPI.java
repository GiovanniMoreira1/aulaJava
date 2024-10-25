package com.mycompany.aula11ex03;

public class IPI implements Imposto {

    @Override
    public double calcular(Orcamento o) {
        return o.getValor() * 0.18;
    }
    
}
