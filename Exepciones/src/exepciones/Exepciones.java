/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exepciones;

import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class Exepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        int edad;

        Scanner entrada = new Scanner(System.in);
        
         // entrada de datos por el teclado
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();

        System.out.printf("Su nombre es %s\n", nombre);
        System.out.printf("Su edad es %s\n", edad);

    }

}
