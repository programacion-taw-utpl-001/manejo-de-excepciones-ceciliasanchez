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

    Estudiante[] lista_estudiante;
    double[] notas_m;
    double[] notas_s;

    public Asignacion(Estudiante[] lis, double[] nm, double[] ns) {
        lista_estudiante = lis;
        notas_m = nm;
        notas_s = ns;

    }

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
    
   

    public double obtener_promedio_estudiantes() {

        double prom;
        double n1 = 0;
        double n2 = 0;

        for (int i = 0; i < notas_m.length; i++) {
            n1 = notas_m[i];
            for (int j = 0; j < notas_s.length; j++) {
                n2 = notas_s[j];
            }
        }
        prom = n1 + n2 / 2;
        return prom;
    }
    
    public String obtenerlista(){
        String lista = " ";
        for (int i = 0; i < lista_estudiante.length; i++) {
            Estudiante estudiante = lista_estudiante[i];
            
        }
        return lista;
    }
    

    @Override
    public String toString() {
        String cadena = String.format("Reporte Final\n"
                + "Lista Estudiantes\n"
                + "Matemáticas %s\n"
                + "Sociales %s\n"
                + "Promedio %s", getNotasM(), getNotasS(), obtener_promedio_estudiantes());
        return cadena;
    }

}
