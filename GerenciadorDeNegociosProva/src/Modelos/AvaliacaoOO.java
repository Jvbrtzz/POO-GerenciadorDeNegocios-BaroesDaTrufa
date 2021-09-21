/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;
import java.io.FileNotFoundException;

/**
 *
 * @author jonat
 */
public class AvaliacaoOO extends Exception {
    
    private String Nome;
    private String Matricula;
    private String Mensagem;

   
    
    
    public AvaliacaoOO(String Mensagem) {
        this.Mensagem = Mensagem;
        
    }
     public String getMensagem() {
        return Mensagem;
    }

    public String getNome() {
        return Nome;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }
    
    public void setMensagem(String Mensagem) {
        this.Mensagem = Mensagem;
    }

    public boolean getMessagem() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public static class  AvaliacaoOONaoInformadaException extends AvaliacaoOO{
        public AvaliacaoOONaoInformadaException(){
            super("Argumento Invalido");
    }
    }
    
    
}
