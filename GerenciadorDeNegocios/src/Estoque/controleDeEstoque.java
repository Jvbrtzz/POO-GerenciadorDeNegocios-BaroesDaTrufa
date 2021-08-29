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
public class controleDeEstoque{
    
    public void estoqueComidaCSV(){
           /* try{
                FileInputStream arquivo = new FileInputStream("comidaEstoque.csv");
                InputStreamReader input = new InputStreamReader(arquivo);
                BufferedReader br = new BufferedReader(input);
                
                String linha;
                
                do{
                    linha = br.readLine();
                    if(linha != null){
                        System.out.println(""+ linha);
                    }
                } while(linha != null);
                                                                                     
            
            
                
                }catch(Exception e){
                System.out.println("Erro");
            }*/
            
//            List<List<String>> records = new ArrayList<>();
//            try (BufferedReader br = new BufferedReader(new FileReader("comidaEstoque.csv"))) {
//                String line;
//                while ((line = br.readLine()) != null) {
//                    String[] values = line.split(";");
//                    records.add(Arrays.asList(values));
//                    
//                }
//            }
//            catch (FileNotFoundException ex){
//                System.out.println("Erro");
//            }
//            catch (IOException ex){
//                System.out.println("Erro");
//            }
//            int i;
//            String t = records.get(i).get(0);
//            int cod = 
//            
//    
//    
    
    
    
        
//         String path = "C:\\comidaEstoque.csv";
         
         
		
//		List<Comida> list = new ArrayList<Comida>();
//		
//		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
//			
//		String line = br.readLine();
//		line = br.readLine();
//		while (line != null) {
//				
//				String[] vect = line.split(";");
//				String codigo = vect[0];
//				Double qtd = Double.parseDouble(vect[1]);
//				
//				
//				Comida prod = new Comida(codigo, qtd);
//				list.add(prod);
//				
//				line = br.readLine();
//			}	
//			
//			System.out.println("comidas");
//			for (Produtos p : list) {   
//				System.out.println(p);
//			}
//		}
//		catch (IOException e) {
//			System.out.println("Error: " + e.getMessage());
//		}
//	}
    }
    public void diminuiEstoque(int cod, int qtde){
         List<List<String>> records = new ArrayList<>();
            try (BufferedReader br = new BufferedReader(new FileReader("comidaEstoque.csv"))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] values = line.split(";");
                    records.add(Arrays.asList(values));
                    int i;
                    
                    
                    
                    for(i = 0; i<8; i++){
                        Integer temp = new Integer(records.get(i).get(0));
                        if(temp == cod){
                            Integer temp2 = new Integer(records.get(i).get(1));
                            int novoEstoque = temp - temp2;
                            String temp3 = String.valueOf(novoEstoque);
                            String records.get(i).get(1)
                            
                        }
                    
                    }
                    
                    
                    
                }
            }
            
            catch (IOException ex){
                System.out.println("Erro");
            }
            
            
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*try{
                
                FileInputStream arquivo = new FileInputStream("comidaEstoque.csv");
                InputStreamReader input = new InputStreamReader(arquivo);
                BufferedReader br = new BufferedReader(input);
                String linha;
                while((line = br.readLine()) != null){
                    array = line{
                    i++;
                   }
                
                do{
                   for (int i = 0; i < 8;i++){
                       
                        String temp = br[0][i];
                        Integer qtde = new Integer(temp.toString());
                   }
                    
                } while(linha != null);
                                                                                     
            
            
                
                }catch(Exception e){
               System.out.println("Erro");
            }} 
        
    }*/
    
}}
