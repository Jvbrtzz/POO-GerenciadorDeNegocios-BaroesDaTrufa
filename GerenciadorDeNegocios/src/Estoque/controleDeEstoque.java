/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estoque;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import Modelos.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author oi
 */
public class ControleDeEstoque{
    
    public static void estoqueComida(){
        
         
        try{ 
            FileInputStream arq = new FileInputStream("comidaEstoque.txt");
            InputStreamReader input = new InputStreamReader(arq);
            BufferedReader br = new BufferedReader(input);
         
            
            String linha = null;
            
            do{
                try{
                    linha = br.readLine();
//                    String[] dado = linha.split(";");                    
                        int cont = 0;
                        System.out.println(linha);
//                        for(int i = 0; i < dado.length; i+=4){                            
//                            if(dado[i] == "03"){
//                                int temp = Integer.parseInt(dado[i+3]);
//                                temp -= 5;
//                                dado[i+3] = Integer.toString(temp);
//                                String sub = dado[i] + " ; " +  dado[i+1] + " ; " +  dado[i+2] + " ; " +  dado[i+3] + " ; ";
                                                            
//                            }
                            cont ++;
//                        }                                       
                                          
                    
                }catch(IOException e){
                    System.out.println(e + "Erro");
                }
            
            
            }while(linha != null);            
        
            
        }catch(FileNotFoundException e){    
            System.out.println(e + "Arquivo não encontrado");
        }
    }
    
    public static void controleEstoque(){
        
    
    }
}
