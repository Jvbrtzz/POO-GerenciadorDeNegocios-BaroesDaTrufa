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
 

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Scanner;
import Visual.MenuPrincipal;
import Modelos.AvaliacaoOO;

/**                                                                                     
 *
 * @author oi
 */
public class ControleDeEstoque{
   
    private boolean estoqueDisponivel;

     public boolean isEstoqueDisponivel() {
        return estoqueDisponivel;
    }

    public void setEstoqueDisponivel(boolean estoqueDisponivel) {
        this.estoqueDisponivel = estoqueDisponivel;
    } 
   
    public void controleEstoque(int val, int cd)throws Exception, FileNotFoundException{
         Scanner scanner = new Scanner(new File("teste.txt"));
         OutputStream fos = new FileOutputStream("comidaEstoque.txt");
         Writer esc = new OutputStreamWriter(fos); 
         BufferedWriter bw = new BufferedWriter(esc);         
         MenuPrincipal Disponivel = new MenuPrincipal();
         AvaliacaoOO ProvaIndividual = new AvaliacaoOO();
         ProvaIndividual.setNome("Jonathan Silva de Sá");
         ProvaIndividual.setMatricula("219083139"); 
         String NomeAluno = ProvaIndividual.getNome();
         String MatriculaAluno = ProvaIndividual.getMatricula();
        
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
                            if(val > estoque){
                                estoque = 0; 
                            }    
                        }
                        
                                                
                        String result = String.format("%s;%s;%s;%s", cod, nome, valor, estoque);

                       
                        bw.write(result);
                        bw.newLine();
                        bw.flush();
                }
          
                bw.write(NomeAluno);
                bw.newLine();
                bw.write(MatriculaAluno);
                bw.newLine();
                bw.flush();
                
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
                        
                        
                        bw1.write(result1);
                        bw1.newLine();
                        bw1.flush();
                        
                       
                }
                
                bw1.write(NomeAluno);
                bw1.newLine();
                bw1.write(MatriculaAluno);
                bw1.newLine();
                bw1.flush();                
                
                bw1.close();
                scanner1.close();
    
}
    public double pegaValor(int qtde, int cd) throws Exception, FileNotFoundException{
        Scanner ler = new Scanner(new File("comidaEstoque.txt"));        
        double total = 0.0;
        while(ler.hasNextLine()) {
                        String linha = ler.nextLine();
                        

                        Scanner linhaScanner = new Scanner(linha);
                        
                        linhaScanner.useDelimiter(";");

                        int cod = linhaScanner.nextInt();
                        String nome = linhaScanner.next();
                        double valor= linhaScanner.nextDouble();
                        int estoque = linhaScanner.nextInt();
                        
                        if(cod == cd){
                          total = qtde*valor;
                           
                            }
                        
        }
        System.out.println(total);
        ler.close();
        return total;
    }   
    public boolean checaEstoque(int qtde, int cd) throws Exception{
        Scanner ler = new Scanner(new File("comidaEstoque.txt"));
        MenuPrincipal Disponivel = new MenuPrincipal();
        
        while(ler.hasNextLine()) {
                        String linha = ler.nextLine();
                        

                        Scanner linhaScanner = new Scanner(linha);
                        
                        linhaScanner.useDelimiter(";");

                        int cod = linhaScanner.nextInt();
                        String nome = linhaScanner.next();
                        int valor= linhaScanner.nextInt();
                        int estoque = linhaScanner.nextInt();
                        
                        if(cod == cd){
                            if(estoque < qtde){
                                this.setEstoqueDisponivel(false);
                            
                            }else{
                                 this.setEstoqueDisponivel(true);
                            }
                              
                                   
                        }
                            
        }
        
        
        return true;
        }
        
}        