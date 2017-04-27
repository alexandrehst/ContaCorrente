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
public class ContaCorrente extends Conta{
    private double limite;
    
    public ContaCorrente(Agencia agencia, Cliente cliente){ 
        super(agencia, cliente);
        limite = 0;
    }

    @Override
    public void sacar(double valor){
        if ((getSaldo() - valor) < limite*-1){
            // Não é possível sacar
        } else {
            super.sacar(valor);
        }
    }
    
    /**
     * @return the limite
     */
    public double getLimite() {
        return limite;
    }

    /**
     * @param limite the limite to set
     */
    public void setLimite(double limite) {
        this.limite = limite;
    }
    
}
