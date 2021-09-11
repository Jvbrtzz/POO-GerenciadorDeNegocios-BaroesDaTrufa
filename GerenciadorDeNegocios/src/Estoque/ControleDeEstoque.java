/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estoque;

/**
 *
 * @author jvbor
 */
 
package Estoque;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import Modelos.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Arrays;
import java.lang.NullPointerException;
import java.util.Scanner;


/**
 *
 * @author oi
 */
public class ControleDeEstoque{
    
    public static void estoqueComida(){
        
         
//        try{ 
//            FileInputStream arq = new FileInputStream("comidaEstoque.txt");
//            InputStreamReader input = new InputStreamReader(arq);
//            BufferedReader br = new BufferedReader(input);
//            
//            OutputStream fos = new FileOutputStream("comidaEstoque.txt");
//            Writer esc = new OutputStreamWriter(fos); 
//            BufferedWriter bw = new BufferedWriter(esc);
//            
//            String linha = null;
//            
//            do{
//                try{
//                    linha = br.readLine();
//                    String[] dado = linha.split(";");                    
//                        int cont = 0;
//                        String temp2 = null;
//                        System.out.println(linha);
//                        for(int i = 0; i < dado.length; i+=4){                            
//                            if(dado[i] == "3"){
//                              int temp = Integer.parseInt(dado[i+3]);
//                              temp -= 5;
//                              temp2 = Integer.toString(temp);
//                              
//                            }
//                            
//                        }                                       
//                        
//                        for(int i = 0; i < dado.length; i+=4){
//                            if(dado[i] == "3"){
//                                String temp3 = dado[i] + " ; " + dado[i+1] + " ; " + dado[i+2] + " ; " + dado[i+3];
//                                bw.write(temp3);
//                                bw.newLine();
//                                
//                            }else{
//                                String temp3 = dado[i] + " ; " + dado[i+1] + " ; " + dado[i+2] + " ; " + temp2;
//                                bw.write(temp3);                                 
//                                bw.newLine();
//                                
//                                
//                            }
//                            bw.flush();
//                        }
//                        
//                        bw.close();
//                        String linha2 = br.readLine();              
//                        System.out.println(linha2);
//                
//                }catch(IOException e){
//                    System.out.println(e + "Erro");
//                }
//            
//            
//            }while(linha != null);            
//        
//            
//        }catch(FileNotFoundException e){    
//            System.out.println(e + "Arquivo não encontrado");
//        }
    }
    
public static void controleEstoque(int val, int cd)throws Exception, FileNotFoundException{
         Scanner scanner = new Scanner(new File("teste.txt"));
         OutputStream fos = new FileOutputStream("comidaEstoque.txt");
         Writer esc = new OutputStreamWriter(fos); 
         BufferedWriter bw = new BufferedWriter(esc);
                while(scanner.hasNextLine()) {
                        String linha = scanner.nextLine();
                        

                        Scanner linhaScanner = new Scanner(linha);
                        
                        linhaScanner.useDelimiter(";");

                        int cod = linhaScanner.nextInt();
                        String nome = linhaScanner.next();
                        int valor= linhaScanner.nextInt();
                        int estoque = linhaScanner.nextInt();
                                                
                        if(cod == cd){
                           estoque -= val;
                       }
                       
                        String result = String.format("%s;%s;%s;%s", cod, nome, valor, estoque);
                        System.out.println(result);
                        bw.write(result);
                        bw.newLine();
                        bw.flush();
                        
                       
                       

                }
                bw.close();
                scanner.close();
                Scanner scanner1 = new Scanner(new File("comidaEstoque.txt"));
                OutputStream fos1 = new FileOutputStream("teste.txt");
                Writer esc1 = new OutputStreamWriter(fos1); 
                BufferedWriter bw1 = new BufferedWriter(esc1);
                while(scanner1.hasNextLine()) {
                        String linha1 = scanner1.nextLine();
                        

                        Scanner linhaScanner = new Scanner(linha1);
                        
                        linhaScanner.useDelimiter(";");

                        int cod = linhaScanner.nextInt();
                        String nome = linhaScanner.next();
                        int valor= linhaScanner.nextInt();
                        int estoque = linhaScanner.nextInt();
                      
                       
                        String result1 = String.format("%s;%s;%s;%s", cod, nome, valor, estoque);
                        System.out.println(result1);
                        bw1.write(result1);
                        bw1.newLine();
                        bw1.flush();
                        
                       
                       

                }
                bw1.close();
                scanner1.close();
    
    }
public static int pegaValor(int cd){
        Scanner ler = new Scanner("comidaEstoque.txt");
        int preco = 0;
        while(ler.hasNextLine()) {
                        String linha = ler.nextLine();
                        

                        Scanner linhaScanner = new Scanner(linha);
                        
                        linhaScanner.useDelimiter(";");

                        int cod = linhaScanner.nextInt();
                        String nome = linhaScanner.next();
                        int valor= linhaScanner.nextInt();
                        int estoque = linhaScanner.nextInt();
                        
                        if(cod == cd){
                            preco = valor;
                            
                        }
        }
        ler.close();
        return preco;
    }   
    
}
