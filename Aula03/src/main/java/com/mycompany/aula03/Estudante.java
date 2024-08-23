package com.mycompany.aula03;

public class Estudante {
   private String nome, curso;
   private int idade;
   
    public void exibeDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Curso: " + curso);
        System.out.println("Idade: " + idade);
        System.out.println();
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void setIdade(int idade){
        if (idade < 0) {
            this.idade = 0;
        }
        this.idade = idade;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getCurso() {
        return curso;
    }
    public int getIdade() {
        return idade;
    }
       // construtor parametrizado
    public Estudante(String nome, String curso, int idade) {
        this.nome = nome;
        this.curso = curso;
        this.idade = idade;
    }
    
    public Estudante() {
    }
}
