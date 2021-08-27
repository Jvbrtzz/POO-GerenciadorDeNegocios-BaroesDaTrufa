/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estoque;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
/**
 *
 * @author oi
 */
public class controleDeEstoque{
    
    public void leitorCSV(){
        
         try {Files.lines(Paths.get("estoque.csv"))
        .forEach(System.out::println);
    }
         catch(IOException e) {
          e.printStackTrace();
}
    }

}