/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacorrente;

import agencia.Agencia;
import cliente.Cliente;

/**
 *
 * @author alexandretorres
 */
public class Conta {
    private double saldo;
    private Cliente cliente;
    private Agencia agencia;
    
    public Conta(Agencia agencia, Cliente cliente){
        this.agencia = agencia;
        this.cliente = cliente;
        saldo = 0;
    }
    
    public void depositar(double valor){
        saldo += valor;   
    }
    
    public void sacar(double valor){
        saldo -= valor;
    }
    
    public double getSaldo(){
        return saldo;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @return the agencia
     */
    public Agencia getAgencia() {
        return agencia;
    }
}
