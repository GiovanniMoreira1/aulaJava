package com.mycompany.aula03ex02;

public class Demo {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Carlos Alberto da Nobrega", "12345678");
        ContaCorrente cc1 = new ContaCorrente("32253444463", 10000);
        
        System.out.println("Dados antes da agregação: ");
        System.out.println(c1);
        //Assim que o cliente é instanciado ele já vem com uma conta relacionada
        //A conta padrão definada dentro da classe ContaCorrente
        
    }
}
