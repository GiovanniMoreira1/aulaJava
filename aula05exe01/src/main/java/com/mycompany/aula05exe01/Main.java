package com.mycompany.aula05exe01;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList <Aluno> alunos = new ArrayList<>();
        
        String nomeLocal, sobrenomeLocal, cursoLocal;
        int idadeLocal;
        System.out.println("Nome: ");
        nomeLocal = input.nextLine();
        System.out.println("Sobrenome: ");
        sobrenomeLocal = input.nextLine();
        System.out.println("Idade: ");
        idadeLocal = input.nextInt();
        input.nextLine();
        System.out.println("Curso:");
        cursoLocal = input.nextLine();
        
        alunos.add(new Aluno(cursoLocal, nomeLocal, sobrenomeLocal, idadeLocal));
        
        alunos.add(new Aluno());
        
        for(Aluno a : alunos) {
            a.print();
        }
        
        
    }
}
