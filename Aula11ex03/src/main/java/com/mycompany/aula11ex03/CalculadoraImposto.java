package com.mycompany.aula11ex03;

public class CalculadoraImposto {
    public void realizaCalculo(Orcamento o, Imposto i){
        double impostoCalculado = i.calcular(o);
        System.out.println(impostoCalculado);
    }
}
