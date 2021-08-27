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
/**
 *
 * @author oi
 */
public class controleDeEstoque{
    
    public void estoqueComidaCSV(){
            try{
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
            }
        
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

}