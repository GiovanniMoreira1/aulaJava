package com.mycompany.aula11ex02;

public class Singleton {
    public static void main(String[] args) {
        
        //Para invocar um metodo static sem um objeto da classe
        //É precisso usar o própio nome da classe como referencia
        //Ex -> AcessoBanco.getAcessoBanco()
        AcessoBanco banco1 = AcessoBanco.getAcessoBanco();
        banco1.setA(5);
        System.out.println(banco1);
        System.out.println(banco1.getA());
        
        AcessoBanco banco2 = AcessoBanco.getAcessoBanco();
        System.out.println(banco2);
        System.out.println(banco2.getA());
    }
}
