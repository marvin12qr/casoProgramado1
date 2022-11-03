
package com.mycompany.tiendavirtual;


public class ColaboradorMain {

   
    public static void main(String[] args) {
        
        Colaborador colaborador1 = new Colaborador();
        
        colaborador1.Login1();
        colaborador1.mostrarDatos();
        
        colaborador1.setNombre("Susan");
        String nombre = colaborador1.getNombre();
        colaborador1.setApellido("Ramirez");
        String apellido = colaborador1.getApellido();
        colaborador1.setEdad(22);
        int edad = colaborador1.getEdad();
        colaborador1.setEmpleado(18);
        int empleado = colaborador1.getEmpleado();
        System.out.println("Su nombre es: " + nombre);
        System.out.println("Su Apellido es: " + apellido);
        System.out.println("Su Edad es: " + edad);
        System.out.println("Su número de empleado es: " + empleado);

        colaborador1.menu1();
        
        
        
    }
    
}
