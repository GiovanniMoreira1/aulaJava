package com.mycompany.funcionario;

public class Funcionario {
    private String nome;
    private String sobrenome;
    private double salarioMensal;
    private int idade;
    private String sexo;
    private int numero;
    
    public Funcionario() {
}
    public Funcionario(String nome, String sobrenome, double salarioMensal, 
    int idade, String sexo, int numero) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
        this.idade = idade;
        this.sexo = sexo;
        this.numero = numero;
    } 
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void exibeDados() {
        System.out.println("Nome: " + nome + " " + sobrenome);
        System.out.println("Salario: " + salarioMensal);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        System.out.println("Numero: " + numero);
    }
}
