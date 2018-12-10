
import java.util.Scanner;

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
        Scanner spider = new Scanner(System.in);
        boolean ques;
        int Ace = 1;
        int sumaplay = 0;
           int suma1 = 0;
       for (int j = 1; j <=2; j++){
           int lilmach = (int) (Math.random()*14)+1 ;       
       suma1 = suma1 + lilmach;
           System.out.println(lilmach);
       }
        System.out.println(suma1);
        
      for (int i = 1; i <=2; i++){
           int numbah = (int) (Math.random()*14)+1 ;
           System.out.println(numbah);    
           sumaplay = sumaplay + numbah;
      } 
        System.out.println(sumaplay);   
   while(sumaplay <= 21 || suma1 <= 21 ){    
       if (sumaplay < 21){
            System.out.println("quieres otra card?");
            ques = spider.nextBoolean();
            if (ques == true){
            int numbah = (int) (Math.random()*14)+1;
            sumaplay = sumaplay + numbah;
            System.out.println(numbah);
                System.out.println(sumaplay); 
            }else {break;}  
        }else {System.out.println("Game over");
       break;}
   }
   
   
        
    }
    
}
