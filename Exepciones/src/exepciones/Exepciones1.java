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
public class Exepciones1 {

    public static void main(String[] args) {
        //int n=10/2;
        //int n=10/0;

        //int valor = Integer.parseInt("Loja");
        int n;
        int n1;
        int r = 0;
        Scanner entrada = new Scanner(System.in);
        boolean no = true;

        do {
            System.out.println("Ingrese el numerador");
            n = entrada.nextInt();
            System.out.println("Ingrese el denominador");
            n1 = entrada.nextInt();
            try {

                r = n / n1;

                no = false;

            } catch (ArithmeticException e) {
                System.out.println(e);

            }
            System.err.println("Solucion es " + r);

        } while (no == true);
    }

}
