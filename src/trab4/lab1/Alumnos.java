/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab4.lab1;

import java.util.HashSet;

/**
 *
 * @author Franquito Ledesma
 */
public class Alumnos {
    
    
    private int legajo;
    private String apellido;
    private String nombre;
    private HashSet<Materia> materias;

    public Alumnos(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.materias = new HashSet<>();;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(HashSet<Materia> materias) {
        this.materias = materias;
    }
    
    public void AgregarMateria (Materia materia){
        if (materias.add(materia)) {
            System.out.println("Materia agregada: " + materia.getNombre());
        } else {
            System.out.println("El alumno ya está inscripto en esta materia: " + materia.getNombre());
        }
    } 
        
    
    
    public int cantidadMaterias(){
          
        return materias.size();
    }
    
}
