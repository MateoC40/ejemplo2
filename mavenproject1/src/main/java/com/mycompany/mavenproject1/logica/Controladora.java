/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.logica;

import com.mycompany.mavenproject1.persistencia.ControladorPersistencia;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class Controladora {
    ControladorPersistencia controlPersis = new ControladorPersistencia();

    public void crearAlumno(Alumno al) {
        controlPersis.crearAlumno(al);
    }
    public Alumno buscarAlumnos(int id) {
        Alumno AL = controlPersis.buscarAlumnos(id);
        return AL;
    }

        public List <Alumno> listarAlumno (){
            
        return controlPersis.listarAlumno();
    }
        public void eliminarAlumno (int id) {
            controlPersis.eliminarAlumno(id);
    }
}
