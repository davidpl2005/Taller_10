package Taller10.Ejercicio1;

import Taller10Poo.Ejercicio1.Estudiante;

public class Ejercicio1 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Persona estudiante = new Estudiante();
        Persona profesor = new Profesor();
        
        persona.presentarse();
        estudiante.presentarse();
        profesor.presentarse();
    }
}
