/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula04exe05;

/* @author Giovanni e Leo*/
public class ContaCorrente {
    private double saldo;
    
    /* @parameter saldo é o valor inicial que a conta corrente recebe */
    public void setSaldo(double saldo) {                                 
        this.saldo = saldo;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    /*O método sacar remove um valor do saldo total da conta corrente
    conforme pedida do usuário */
    /* @parameter valor é o que será removido do saldo total*/
    public double sacar(double valor) {
        this.saldo = saldo - valor;
        return saldo;
    }
    
    
    /*O método depositar adiciona um valor ao saldo total da conta corrente
    conforme pedida do usuário */
    /* @parameter valor é o que será adicionado ao saldo total*/
    public double depositar(double valor) {
        this.saldo = saldo + valor;
        return saldo;
    }
    
    
}
