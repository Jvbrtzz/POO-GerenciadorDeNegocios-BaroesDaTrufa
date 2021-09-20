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
public class AvaliacaoOO extends Exception{
    private String nome;
    private String matricula;
    private String msg;

    public AvaliacaoOO(String msg) {
        this.msg = msg;
    }
    
    
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public static class  AvaliacaoOONaoInformadaException extends AvaliacaoOO{
        public AvaliacaoOONaoInformadaException(){
            super("Argumento Invalido");
    }
    }
}