package com.mycompany.cliente;

public class Cliente {
    private String nome, cpf;
    
    
    private ContaCorrente cc;

    public Cliente() {
    }

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public Cliente(String nome, String cpf, ContaCorrente cc) {
        this.nome = nome;
        this.cpf = cpf;
        this.cc = cc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public ContaCorrente getContaCorrente() {
        return cc;
    }

    public void setContaCorrente(ContaCorrente cc) {
        this.cc = cc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", cpf=" + cpf + ", cc=" + cc + '}';
    }

    
    
    
}
