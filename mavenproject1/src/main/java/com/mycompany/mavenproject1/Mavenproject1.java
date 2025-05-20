/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.persistencia.ControladorPersistencia;
import com.mycompany.mavenproject1.logica.Alumno;
import com.mycompany.mavenproject1.logica.Carrera;
import java.util.*;

/**
 *
 * @author Usuario
 */
public class Mavenproject1 {

    public static void main(String[] args) {

        ControladorPersistencia Contro = new ControladorPersistencia();

        // Crear carreras
        
        Carrera carrera1 = new Carrera(1, "Sistemas", "Tecnicatura");
        Carrera carrera2 = new Carrera(2, "Medicina", "Salud");
        
        
        //Contro.crearCarrera(carrera1);
        //Contro.crearCarrera(carrera2);
        
        

        // Crear alumnos y asignar carrera
        Alumno alu1 = new Alumno(1, "Juan", "Perez", new Date(), carrera1);
        Alumno alu2 = new Alumno(2, "Carlos", "Rios", new Date(), carrera2);

        //Contro.crearAlumno(alu1);
        //Contro.crearAlumno(alu2);

        // Buscar y mostrar
        Alumno buscado = Contro.buscarAlumnos(1);
        
        
        if (buscado != null) {
            System.out.println(buscado.getId()+ " - " +buscado.getNombre() + " - " +buscado.getApellido()+ " - "  + buscado.getCarrera().getIdCarrera()+ " - " +buscado.getCarrera().getNombreCarrera());
        }
        else{
            System.out.println("no se encontro alumno");
        }
        
    }
}