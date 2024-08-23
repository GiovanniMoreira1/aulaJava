package com.mycompany.aula03;

public class EstudanteDemo {
    public static void main(String[] args) {
        Estudante e1 = new Estudante();
        e1.setNome("Jorge");
        e1.setCurso("Arquiteto");
        e1.setIdade(2);
        e1.exibeDados();
        
        Estudante e2 = new Estudante("Pedro", "Engenheiro civil", 4);
        e2.exibeDados();
        
        Estudante e3 = new Estudante("Bob", "Pedreiro", 0);
        e3.exibeDados();
       
        System.out.println("BEM VINDO");
        System.out.println("Estudante E1: " + e1.getNome());
        System.out.println("Curso E1: " + e1.getCurso());   
        System.out.println("Voce tem " + e1.getIdade() + " anos");
        
        // pergunta construtores - construtores com mesmo nome sao validos desde que as assinaturas sejam diferentes
    }
}
