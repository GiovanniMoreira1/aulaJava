package com.mycompany.funcionario;


public class FuncionarioDemo {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Bob", "Marley", 4.20, 12, "m", 1);
        f1.exibeDados();
        
        Funcionario f2 = new Funcionario();
        f2.exibeDados();
    }
}
