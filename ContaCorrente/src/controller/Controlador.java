/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import contacorrente.Conta;
import agencia.Agencia;
import agencia.Banco;
import cliente.Cliente;
import contacorrente.ContaCorrente;

/**
 *
 * @author alexandretorres
 */
public class Controlador {
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente("Joaquim José de Alcântara Xavier");
        Banco banco = new Banco( 1, "Banco do Brasil");
        Agencia agencia = new Agencia( banco, 3030);
        ContaCorrente conta = new ContaCorrente( agencia, cliente);

        conta.setLimite(100);
        conta.depositar(1000);
        conta.sacar(2000);
        
        // o saldo deverá ser 1000
        System.out.println("O saldo da conta é R$ " + conta.getSaldo());
        
        conta.sacar(1050);
        // o saldo deverá ser -50
        System.out.println("O saldo da conta é R$ " + conta.getSaldo());
    }
}
