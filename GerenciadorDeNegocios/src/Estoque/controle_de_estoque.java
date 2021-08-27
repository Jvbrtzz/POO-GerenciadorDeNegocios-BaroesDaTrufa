/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estoque;

import java.nio.file.Files;
import java.nio.file.Paths;
/**
 *
 * @author oi
 */
public class controle_de_estoque {  
    public static leitor_csv(controle_de_estoque x) {
        Files.lines(Paths.get("estoque.csv"))
        .forEach(System.out::println);        
    }
}
