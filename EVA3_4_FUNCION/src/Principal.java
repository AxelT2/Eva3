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
        Principal Lamp = new Principal();
        Lamp.imprimirMensaje("Bo bo boi");
        Math.random();
        
    }
    //Paradigmas de prgramación:
    //  Programación estructurada
    //  Programación modular, orientada a objetos,
    //  orientada a objetos, logica, funcional 
    
    //OOP
    //público, privado, protegido, default
    //
    
    static void imprimirMensaje(String mensaje){
        System.out.println("Hola " + mensaje);
    }
    
    
}
