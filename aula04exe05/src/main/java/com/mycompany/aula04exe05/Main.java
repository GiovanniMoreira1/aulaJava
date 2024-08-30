package com.mycompany.aula04exe05;
import java.util.ArrayList;
import java.util.Scanner;

/* @author Giovanni e Leo */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Inicializando Scanner
        /* Cria um ArrayList de contas corrente */
        ArrayList<ContaCorrente> banco = new ArrayList<>();
        
        /* Loop para criar 10 contas e atribuir um saldo inicial */
        for (int i = 0; i < 10; i++) {
            ContaCorrente cc = new ContaCorrente();
            
            System.out.println("Valor inicial da conta " + i + " :");
            cc.setSaldo(input.nextDouble());
            input.nextLine();
            
            // Adiciona a conta criada ao ArrayList 
            banco.add(cc);
        }
        
        System.out.println("Digite a qual conta voce quer acessar: ");
        int conta = input.nextInt(); // Recebe o índice da conta
        input.nextLine();
        
        System.out.println("Saldo da conta " + conta);
        banco.get(conta).getSaldo(); // Pega o saldo da conta indicada
        
        System.out.println("Opções do banco: 1 - Sacar , 2 - Depositar");
        String opcao = input.nextLine(); 
        if(opcao.equals("1")){ // Valida opções do menu
            System.out.println("Digite o valor a sacar: ");
            double valor = input.nextDouble();
            
            // Usa o método sacar para efetuar o saque
            double saldo_novo = banco.get(conta).sacar(valor);
            
            System.out.println("Saldo atualizado: " + saldo_novo);
        }else{
            System.out.println("Digite o valor a depositar: ");
            double valor = input.nextDouble();
            
            // Usa o método depositar para efetuar o depósito
            double saldo_novo = banco.get(conta).depositar(valor);
            System.out.println("Saldo atualizado: " + saldo_novo);
        }
    }
}
