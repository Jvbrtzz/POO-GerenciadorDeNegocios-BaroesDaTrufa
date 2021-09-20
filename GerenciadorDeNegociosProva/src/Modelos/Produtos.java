/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author jvbor
 */
public abstract class Produtos {
    private String nome;
    private String codigo;
    private Double valor;
    private Double qtd;

    public Produtos(String nome, String codigo, Double valor) {
        this.nome = nome;
        this.codigo = codigo;
        this.valor = valor;
    }

    public Produtos(String codigo, Double qtd) {
        this.codigo = codigo;
        this.qtd = qtd;
    }

    public Produtos(String nome, String codigo, Double valor, Double qtd) {
        this.nome = nome;
        this.codigo = codigo;
        this.valor = valor;
        this.qtd = qtd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getQntd() {
        return qtd;
    }

    public void setQntd(Double qntd) {
        this.qtd = qtd;
    }
   
}