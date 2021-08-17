/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.helper;

import Modelos.Gerente;
import Visual.Admin;

/**
 *
 * @author jvbor
 */
public class AdminHelper {
    private final Admin view;

    public AdminHelper(Admin Visual) {
        this.view = Visual;
    }
    
    public Gerente obterModelo(){
        String nome = view.getjTextField1().getText();
        String senha = view.getjPasswordField1().getText();
        Gerente modelo = new Gerente(nome, senha);
        return modelo;
    }
    public void setarModelo(Gerente modelo){
        String nome = modelo.getNome();
        String senha = modelo.getSenha();
        
        view.getjTextField1().setText(nome);
        view.getjPasswordField1().setText(senha);
    }
    public void limparTela(){
        view.getjTextField1().setText("");
        view.getjPasswordField1().setText("");
        
    }

}
