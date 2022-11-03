package com.mycompany.tiendavirtual;

public class ClientesMain {

    public static void main(String[] args) {

        Clientes clientes1 = new Clientes();

        clientes1.Login2();
        clientes1.mostrarDatos();

        clientes1.setNombre("Josselyn");
        String nombre = clientes1.getNombre();
        clientes1.setApellido("Pizarro");
        String apellido = clientes1.getApellido();
        clientes1.setEdad(22);
        int edad = clientes1.getEdad();
        clientes1.setCorreo("Jocelynpizarro131@gmail.com");
        String correo = clientes1.getCorreo();
        clientes1.setCedula(207250087);
        int cedula = clientes1.getCedula();
        clientes1.setTelefono(24505534);
        int telefono = clientes1.getTelefono();

        System.out.println("Su nombre es: " + nombre);
        System.out.println("Su Apellido es: " + apellido);
        System.out.println("Su Edad es: " + edad);
        System.out.println("Su correo eléctronico es: " + correo);
        System.out.println("Su número de cédula es: " + cedula);
        System.out.println("Su número de teléfono es: " + telefono);
        
        clientes1.menu2();

    }

}
