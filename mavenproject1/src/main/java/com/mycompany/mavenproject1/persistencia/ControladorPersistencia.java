/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.persistencia;

import com.mycompany.mavenproject1.logica.Alumno;
import com.mycompany.mavenproject1.logica.Carrera;
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
    CarreraJpaController carreraJPA = new CarreraJpaController();

    // Métodos para Alumno
    public void crearAlumno(Alumno al) {
        aluJPA.create(al);
    }

    public Alumno buscarAlumnos(int id) {
        return aluJPA.findAlumno(id);
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

    // Métodos para Carrera
    public void crearCarrera(Carrera car) {
        carreraJPA.create(car);
    }

    public Carrera buscarCarrera(int id) {
        return carreraJPA.findCarrera(id);
    }

    public List<Carrera> listarCarrera() {
        return carreraJPA.findCarreraEntities();
    }

    public void eliminarCarrera(int id) {
        try {
            carreraJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}