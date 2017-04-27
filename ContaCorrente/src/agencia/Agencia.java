/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agencia;

/**
 *
 * @author alexandretorres
 */
public class Agencia {
    private int numero;
    private Banco banco;
    
    public Agencia(Banco banco, int numero){
        this.banco  = banco;
        this.numero = numero;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @return the banco
     */
    public Banco getBanco() {
        return banco;
    }
    
}
