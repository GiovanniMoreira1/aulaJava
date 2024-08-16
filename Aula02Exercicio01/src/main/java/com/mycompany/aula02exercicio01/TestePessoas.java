package com.mycompany.aula02exercicio01;
import java.util.Scanner;

public class TestePessoas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Pessoas p1 = new Pessoas();
        Pessoas p2 = new Pessoas();
        Pessoas p3 = new Pessoas();
        
        System.out.println("Informe o nome de p1: ");
        String nomeLocal = input.nextLine();
        
        System.out.println("Informe o CPF de p1: ");
        String cpfLocal = input.nextLine();
        
        System.out.println("Informe a idade de p1: ");
        int idadeLocal = input.nextInt();
        p1.setNome(nomeLocal);
        p1.setCpf(cpfLocal);
        p1.setIdade(idadeLocal);
        
        input.nextLine();
    
        System.out.println("Informe o nome de p2:");
        
        nomeLocal = input.nextLine();
        
        System.out.println("Informe o CPF de p2:");
        
        cpfLocal = input.nextLine();
        
        System.out.println("Informe a idade de p2:");
        
        idadeLocal = input.nextInt();
        
        p2.setNome(nomeLocal);
        p2.setCpf(cpfLocal);
        p2.setIdade(idadeLocal);
        
        input.nextLine();
        
        System.out.println("Informe o nome de p3: ");
        nomeLocal = input.nextLine();
        
        System.out.println("Informe o CPF de p3: ");
        cpfLocal = input.nextLine();
        
        System.out.println("Informe a idade de p3: ");
        idadeLocal = input.nextInt();
        
        p3.setNome(nomeLocal);
        p3.setCpf(cpfLocal);
        p3.setIdade(idadeLocal);
        
        System.out.println("| Nome: " + p1.getNome() + " | CPF: " + p1.getCpf() + " | Idade: " + p1.getIdade() + " |");
        System.out.println("| Nome: " + p2.getNome() + " | CPF: " + p2.getCpf() + " | Idade: " + p2.getIdade() + " |");
        System.out.println("| Nome: " + p3.getNome() + " | CPF: " + p3.getCpf() + " | Idade: " + p3.getIdade() + " |");
    }
    
}
