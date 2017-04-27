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
public class Banco {
    private int numero;
    private String nome;
    
    public Banco(int numero, String nome){
        this.numero = numero;
        this.nome = nome;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }
    
}
