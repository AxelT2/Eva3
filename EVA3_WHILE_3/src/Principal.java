
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author answa
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner spider = new Scanner(System.in);
       int lilNumbah;
       
        System.out.println("Introduzca un nùmero");
       lilNumbah = spider.nextInt();
       if(lilNumbah % 2 == 0){
           System.out.println("No es primo");
       }else{
           System.out.println("Sí es primo");
       }
       
    }
    
}
