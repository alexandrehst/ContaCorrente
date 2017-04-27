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

/**
 *
 * @author alexandretorres
 */
public class Controlador {
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente("Joaquim José de Alcântara Xavier");
        Conta conta = new Conta(
                        new Agencia(
                                new Banco( 1, "Banco do Brasil"),
                                3030),
                        cliente);
        conta.depositar(1000);
        conta.sacar(300);
        
        System.out.println("O saldo da conta é R$ " + conta.getSaldo());
    }
}
