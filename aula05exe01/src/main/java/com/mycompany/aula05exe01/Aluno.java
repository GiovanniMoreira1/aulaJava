package com.mycompany.aula05exe01;

public class Aluno extends Pessoa {
    private String curso;

    public Aluno(String curso, String nome, String sobrenome, int idade) {
        super(nome, sobrenome, idade);
        this.curso = curso;
    }

    public Aluno() {
    }
    
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void print() {
        System.out.println("Aluno: " + nome + " " + sobrenome + " | Idade: " + 
    idade + " | Curso: " + curso);
    }

    
}
