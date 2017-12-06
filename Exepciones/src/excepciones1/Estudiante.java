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
public class Estudiante {

    private String nombre;
    private String apellido;
    
    public Estudiante(String n, String a){
        nombre = n;
        apellido = a;
    }

    public void setNombre(String n) {
        nombre = n;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String a) {
        apellido = a;
    }

    public String getApellido() {
        return apellido;
        
    }
    
    @Override
    public String toString(){
        String cadena = String.format("%s %s",getNombre(),getApellido());
        return cadena;
    }
}
