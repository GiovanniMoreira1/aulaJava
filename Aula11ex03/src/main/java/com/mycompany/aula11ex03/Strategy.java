package com.mycompany.aula11ex03;

public class Strategy {
    public static void main(String[] args) {
        Orcamento o = new Orcamento(10000000);
        CalculadoraImposto calc = new CalculadoraImposto();
        
//        double somaImpostoTotal = 0;
        Imposto i;
        
        i = new ISS();
        calc.realizaCalculo(o, i);
        
        i = new IPI();
        calc.realizaCalculo(o, i);
        
        i = new ICMS();
        calc.realizaCalculo(o, i);
        
        i = new PISCOFINS();
        calc.realizaCalculo(o, i);
    }
}
