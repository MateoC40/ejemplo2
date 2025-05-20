/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.persistencia.ControladorPersistencia;
import com.mycompany.mavenproject1.logica.Alumno;
import java.util.*;

/**
 *
 * @author Usuario
 */
public class Mavenproject1 {

    public static void main(String[] args) {

        ControladorPersistencia Contro = new ControladorPersistencia();

        // Crear alumnos
        
        Alumno alu1 = new Alumno(1, "Juan", "Perez", new Date());
        Alumno alu2 = new Alumno(2, "Carlos", "Rios", new Date());
        Alumno alu3 = new Alumno(3, "Marcelo", "Quizpe", new Date());
        Alumno alu4 = new Alumno(4, "Maria", "Castro", new Date());

        
        
        Contro.crearAlumno(alu1);
        Contro.crearAlumno(alu2);
        Contro.crearAlumno(alu3);
        Contro.crearAlumno(alu4);
        
        

        // Buscar un alumno
        Alumno Buscado1 = Contro.buscarAlumnos(1);

        if (Buscado1 != null) {
            System.out.println(Buscado1.getNombre());
        } else {
            System.out.println("Alumno no encontrado.");
        }

        // Listar todos los alumnos
        List<Alumno> Listacompleta = Contro.listarAlumno();
        for (Alumno nombres : Listacompleta) {
            System.out.println(nombres.getNombre() + " " + nombres.getApellido());
        }

        // Eliminar un alumno
        Contro.eliminarAlumno(4);  // ID del alumno a eliminar
        System.out.println("Alumno con ID 5 eliminado.");

        // Listar nuevamente después de la eliminación
        List<Alumno> ListaActualizada = Contro.listarAlumno();
        System.out.println("Lista actualizada de alumnos:");
        for (Alumno nombres : ListaActualizada) {
            System.out.println(nombres.getNombre() + " " + nombres.getApellido());
        }
        
        Contro.crearAlumno(alu4);
    }
}