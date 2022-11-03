package com.mycompany.tiendavirtual;

import javax.swing.JOptionPane;

public class AdministradorMain {

    public static void main(String[] args) {

        Administrador administrador1 = new Administrador();

        administrador1.Login();
        administrador1.mostrarDatos();

        administrador1.setNombre("Orlando");
        String nombre = administrador1.getNombre();
        administrador1.setApellido("Acuña");
        String apellido = administrador1.getApellido();
        administrador1.setEdad(30);
        int edad = administrador1.getEdad();
        administrador1.setId(02);
        int id = administrador1.getId();
        System.out.println("Su nombre es: " + nombre);
        System.out.println("Su Apellido es: " + apellido);
        System.out.println("Su Edad es: " + edad);
        System.out.println("Su ID es: " + id);

        administrador1.menu();

    }
}
