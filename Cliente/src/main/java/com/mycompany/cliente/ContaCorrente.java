package com.mycompany.cliente;

public class ContaCorrente {
    private String num;
    private double saldo;

    public ContaCorrente() {
        num = "000001";
        saldo = 0.01;
    }

    public ContaCorrente(String num, double saldo) {
        this.num = num;
        this.saldo = saldo;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}
