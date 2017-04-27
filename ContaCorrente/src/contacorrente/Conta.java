/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacorrente;

import agencia.Agencia;
import cliente.Cliente;
import java.util.ArrayList;

/**
 *
 * @author alexandretorres
 */
public abstract class Conta {
    protected double saldo;
    private Cliente cliente;
    private Agencia agencia;
    private ArrayList<Movimentacao> historico;
    
    public abstract void atualizacaoMensal();
    
    public Conta(Agencia agencia, Cliente cliente){
        this.agencia = agencia;
        this.agencia.getContas().add(this);
        this.cliente = cliente;
        saldo = 0;
        historico = new ArrayList<>();
    }
    
    public String extrato(){
        String txt = "Extrato\n--------------------\n";
        for(Movimentacao m : historico){
            txt += m;
            txt += "\n";
        }
        
        txt +="\nSaldo: R$ " + getSaldo();
        return txt;
    }
    
    public void depositar(double valor){
        saldo += valor;   
        historico.add( new Movimentacao( "Depósito", valor));
    }
    
    public void sacar(double valor){
        saldo -= valor;
        historico.add( new Movimentacao( "Saque", valor *-1));
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
