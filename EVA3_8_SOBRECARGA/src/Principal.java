/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Axel Arath Tello Atondo 
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        System.out.println("hola");
        System.out.println(7);
        System.out.println(true);
        System.out.println(new Principal());//
        System.out.println(suma(5,8));
        suma(bruh3, bruh4);
        
    }
    String bruh3 = "Hola";
        String bruh4 = "Mundo";
    public static int suma(int bruh1, int bruh2){    
        return bruh1 + bruh2;
    }
    public static int suma(String bruh3, String bruh4){    
        return bruh3 + bruh4;
    }
    public static int suma(double bruh5, double bruh6){    
        return bruh5 + bruh6;}
}
