/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones1;

import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class Ejecutor {

    public static void main(String[] args) {

        int numero_alumnos = 4;
        int contador = 1;

        Estudiante[] lista = new Estudiante[4];
        double[] notas_s = new double[4];
        double[] notas_m = new double[4];
        Scanner entrada = new Scanner(System.in);

       
        
        do {
            
            System.out.println("Ingrese el nombre del estudiante");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese el apellido del estudiante");
            String apellido = entrada.nextLine();
            
            
            try {
                
                
                
            }
            catch(Exception e){
                System.err.println("Error en el ingreso de estudiantes");
                
            }
            

        } while (contador <4);
        
     

    }

}
