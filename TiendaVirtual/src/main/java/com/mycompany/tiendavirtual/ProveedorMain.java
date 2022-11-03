package com.mycompany.tiendavirtual;

public class ProveedorMain {

    public static void main(String[] args) {

        Proveedor proveedor1 = new Proveedor();

        proveedor1.mostrarDatos();

        proveedor1.setNombre("Office Depot");
        String nombre = proveedor1.getNombre();
        proveedor1.setTelefono("22505534");
        String telefono = proveedor1.getTelefono();
        proveedor1.setDireccion("Uruca,San Jose");
        String direccion = proveedor1.getDireccion();
        proveedor1.setId(22);
        int id = proveedor1.getId();

        System.out.println("El nombre del proveedor es: " + nombre);
        System.out.println("Su telefono es: " + telefono);
        System.out.println("Su direccion es: " + direccion);
        System.out.println("Su ID es: " + id);

        proveedor1.menu1();

    }

}
