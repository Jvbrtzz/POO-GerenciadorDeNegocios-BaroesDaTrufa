/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Modelos.Gerente;
import Visual.Admin;
import controller.helper.AdminHelper;

/**
 *
 * @author jvbor
 */
public class adminController {

    private final Admin view;
    private AdminHelper helper;

    public adminController(Admin view) {
        this.view = view;
        this.helper = new AdminHelper(view);
    }
    public void entrarNoSistema(){
       Gerente gerente = helper.obterModelo();
    
    
    }
    
    public void click(){
        System.out.println("buscar");
        this.view.exibeMensagem("Executei");
    }
}