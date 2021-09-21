/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 * teste teste
 * @author jvbor
 */
public class Bebida extends Produtos{

    public Bebida(String nome, String codigo, Double valor, Double qntd) {
        super(nome, codigo, valor, qntd);
    }
    public Bebida(String codigo, Double qntd) {
        super(codigo, qntd);
}
    public Bebida(String nome, String codigo, Double valor) {
        super(nome, codigo, valor);
    }
    
}