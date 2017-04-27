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
public class ContaPoupanca extends Conta {
    
    public ContaPoupanca(Agencia agencia, Cliente cliente){ 
        super(agencia, cliente);
    }
    
    @Override
    public void sacar(double valor){
        if ((getSaldo() - valor) < 0){
            // Não é possível sacar
        } else {
            super.sacar(valor);
        }
    }
    
    public void atualizacaoMensal(){
        depositar(saldo*.06);
    }
    
}
