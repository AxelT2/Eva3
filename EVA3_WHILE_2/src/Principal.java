
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
       String User;
       String User2 = "";
       String Contra;
       String Contra2 = "";
       int i = 3;
        System.out.println("Cree un usuario (Introduzca usuario)");
        User = spider.nextLine();
        System.out.println("Cree una contraseña");
        Contra = spider.nextLine();
       while (!User2.equals(User) || !Contra2.equals(Contra)){
            System.out.println("Introduzca usuario");
        User2 = spider.nextLine();
            System.out.println("Introduzca la contraseña");
        Contra2 = spider.nextLine();
        if (User2.equals(User) && Contra2.equals(Contra)){
           System.out.println("Bienvenido");
       }
       i = i -1;
       if(i == 0){
           System.out.println("Ya no tienes intentos");
           break;
       }
       }
        
        
        
        
    }
    
}
