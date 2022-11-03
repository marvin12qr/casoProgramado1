
package com.mycompany.tiendavirtual;


public class ProductosMain {

   
    public static void main(String[] args) {
        
        Productos productos1 = new Productos();
        
        productos1.mostrarDatos();
        
        productos1.setDescripcion("Etiquetas");
        String descripcion = productos1.getDescripcion();
        productos1.setGarantia("2 años");
        String garantia = productos1.getGarantia();
        productos1.setPrecio(1500);
        int precio = productos1.getPrecio();
        
        System.out.println("Selecciono Producto: " + descripcion);
        System.out.println("La garantia será: " + garantia);
        System.out.println("El precio será: " + precio);
        
        
        
        
        
    }
    
}
