/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.io.Serializable;

/**
 *
 * @author jvbor
 */
public class Comida extends Produtos implements Serializable{
    
    public Comida(String nome, String codigo, Double valor, Double qntd) {
        super(nome, codigo, valor, qntd);
    }
    public Comida(String codigo, Double qtd){
        super(codigo, qtd);
    }
    public Comida(String nome, String codigo, Double valor) {
        super(nome, codigo, valor);
    }
    
    public String toString(Produtos x) {
		return "Product [name=" + x.getCodigo() + ", price=" + x.getQntd() +"]";
	}
}
    