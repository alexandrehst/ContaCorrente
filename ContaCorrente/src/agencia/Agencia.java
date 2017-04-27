/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agencia;

import contacorrente.Conta;
import java.util.ArrayList;

/**
 *
 * @author alexandretorres
 */
public class Agencia {
    private int numero;
    private Banco banco;
    private ArrayList<Conta> contas;
    
    public Agencia(Banco banco, int numero){
        this.banco  = banco;
        this.numero = numero;
        contas = new ArrayList<>();
    }
    
    public void atualizacao(){
        for (Conta c:contas){
            c.atualizacaoMensal();
        }
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

    /**
     * @return the contas
     */
    public ArrayList<Conta> getContas() {
        return contas;
    }
    
}
