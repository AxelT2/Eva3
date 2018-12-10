/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Axel Arath Tello Atondo 18550730
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
       int iVal = 5;
       int iResu = calculaFactorial(iVal);
        System.out.println("Resultado = " + iResu);
    }
    public static int calculaFactorial(int iVal){
        int iResu = 1;
        
        for(int i = iVal; i >= 1; i--){
            iResu *= i;
        }
    return iResu;  }
           
            
            
            
}
