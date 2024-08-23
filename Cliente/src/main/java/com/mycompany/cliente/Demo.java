package com.mycompany.cliente;

public class Demo {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Carlos Alberto da Nobrega", "12345678");
        ContaCorrente cc1 = new ContaCorrente("32253444463", 10000);
        
        System.out.println("Dados antes da agregação: "); 
        //Objetos foram instanciados separados
        System.out.println(c1);
        System.out.println(cc1);
        
        c1.setContaCorrente(cc1);
        System.out.println("Dados depois da agregação: "); 
        //Conta corrente foi setada como parametro dentro do c1
        c1.toString();
        cc1.toString();
        
        //Caso cc1 seja deletado c1 vai perder a referencia e dar erro
        //Passagem de dados por referencia, você esta passando o dado original
        //Passagem de dados por valor você esta passando uma duplicata do dado
        
        //Em Java tipos primitivos (int, etc) são passados por valor
        //Tipos que são classes (String, ContaCorrente, etc) estamos passando como referencias
    }
}
