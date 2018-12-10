/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author temporal2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(new Principal());
        Valem = new bruh();
        
        System.out.println(Valem);
        bruh cObjeto2 = new bruh();
        System.out.println(cObjeto2);
        int iValor = 5;
        incrementa(iValor);
        System.out.println("Valor es "+ iValor);
        //
        Valor cObjetoV = new Valor();
        cObjetoV.boi = 5;
        System.out.println("Valor es " + iValor);
        
        
        
        
    }
    public static void incrementa(int iVal){
    iVal++;
    }
    public static void incrementa(Valor iboi){
    iboi.boi++;
    }
    static class bruh{}
}
class Valor{
int boi;}