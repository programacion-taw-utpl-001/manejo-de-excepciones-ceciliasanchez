/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones1;

/**
 *
 * @author Salas
 */
public class Asignacion {

    //Atribtos de la clase Asignacion
    Estudiante[] lista_estudiante;
    double[] notas_m;
    double[] notas_s;

    //constructor de la clase Asignacion 
    public Asignacion(Estudiante[] lis, double[] nm, double[] ns) {
        lista_estudiante = lis;
        notas_m = nm;
        notas_s = ns;

    }
    //métodos get y set de la clase Asignación

    public void setLista(Estudiante[] lista) {
        lista = lista_estudiante;
    }

    public Estudiante[] getLista() {
        return lista_estudiante;
    }

    public void setNotasM(double[] notasm) {
        notas_m = notasm;
    }

    public double[] getNotasM() {
        return notas_m;
    }

    public void setNotasS(double[] notas) {
        notas_s = notas;
    }

    public double[] getNotasS() {
        return notas_s;
    }

    public double obtener_promedio_matematicas() {
        double prom = 0;
        for (int i = 0; i < 4; i++) {
            prom += notas_m[i];
        }
        return prom;
    }

    public double obtener_promedio_sociales() {
        double prom = 0;
        for (int i = 0; i < 4; i++) {
            prom += notas_s[i];
        }
        return prom;
    }

    double promedio[];

    public double[] promedio_alumno() {
        double prom[] = new double[4];
        for (int i = 0; i < promedio.length; i++) {

            //llamamos a los atributos notas matematicas y notas sociales para realizar el promedio de cada alumno
            prom[i] = (notas_m[i] + notas_s[i]) / 2;
        }
        return promedio;
    }

    // Metodo toString para la lista de estudiantes
    public String lista_estudiantes() {
        String cadena = "";
        for (int i = 0; i < lista_estudiante.length; i++) {
            cadena += String.format("%s\n"
                    + "\tMatematicas: %.1f\n"
                    + "\tSociales: %.1f\n"
                    + "\tPromedio: %.1f\n\n",
                    getLista()[i], getNotasM()[i], getNotasS()[i], promedio_alumno()[i]);
        }
        return cadena;
    }

    //sobreescribimos el metodo toString
    @Override
    public String toString() {
        String cadena = String.format("\n Reporte Final\n"
                + "Lista Estudiantes\n"
                + "%s\n"
                + "Promedios Generales\n\n"
                + "Promedio Matemáticas: %s\n"
                + "Promedio Sociales: %s\n", lista_estudiantes(),obtener_promedio_matematicas(),obtener_promedio_sociales());
        return cadena;
    }

}
