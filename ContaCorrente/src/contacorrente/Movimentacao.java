/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacorrente;

/**
 *
 * @author alexandretorres
 */
public class Movimentacao {
    private String historico;
    private double valor;
    
    public Movimentacao(String historico, double valor){
        this.historico = historico;
        this.valor = valor;
    }  
    
    @Override
    public String toString(){
        return historico + "\t"+ valor;
    }
}
