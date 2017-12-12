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
        
        int num_alumnos = 4;
        int contador = 1;
        //Objeto tipo estudiante
        Estudiante[] lista = new Estudiante[4];
        //objetos tipo double
        double[] notas_s = new double[num_alumnos];
        double[] notas_m = new double[num_alumnos];
        
        //permite la lectura de los datos por teclado
        Scanner entrada = new Scanner(System.in);
            
        //objeto tipo asignacion
          Asignacion as = new Asignacion(lista, notas_m, notas_m);

        do {

            try {
                System.out.println("Ingrese el nombre del estudiante");
                String nombre = entrada.nextLine();
                System.out.println("Ingrese el apellido del estudiante");
                String apellido = entrada.nextLine();
                lista[contador] = new Estudiante(nombre, apellido);

                System.out.println("Ingrese la nota de matematicas");
                double matematicas = Double.parseDouble(entrada.nextLine());
                notas_m[contador] = matematicas;
                System.out.println("Ingrese la nota de sociales");
                double sociales = Double.parseDouble(entrada.nextLine());
                notas_s[contador] = sociales;
                contador++;
                
                //execepcion que impide que el programa caiga
            } catch (NumberFormatException e) {
                System.err.print(e);
                //Para volver a pedir que el usuario ingrese un numero
                System.out.println("Debe ingresar un numero");
            }

        } while (contador <= num_alumnos);
     
        System.out.println(as);

    }

}
