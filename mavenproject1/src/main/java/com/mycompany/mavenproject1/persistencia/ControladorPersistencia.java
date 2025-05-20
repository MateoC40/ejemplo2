/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.persistencia;

import com.mycompany.mavenproject1.logica.Alumno;
import com.mycompany.mavenproject1.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class ControladorPersistencia {

    AlumnoJpaController aluJPA = new AlumnoJpaController();
    CarreraJpaController CarreJPA = new CarreraJpaController();

    public void crearAlumno(Alumno al) {
        aluJPA.create(al);
    }

    public Alumno buscarAlumnos(int id) {
        Alumno AL = aluJPA.findAlumno(id);
        return AL;
    }

    public List<Alumno> listarAlumno() {
        return aluJPA.findAlumnoEntities();
    }

    public void eliminarAlumno(int id) {

        try {
            aluJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
