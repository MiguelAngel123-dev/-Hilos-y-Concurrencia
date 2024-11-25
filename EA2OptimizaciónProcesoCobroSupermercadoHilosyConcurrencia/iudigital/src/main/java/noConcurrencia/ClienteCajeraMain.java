package noConcurrencia;

import java.util.ArrayList;
import java.util.List;

import cliente.Producto;
import cliente.ProductoCliente;

/**
 * <b>Descripción:</b> Clase principal que simula el procesamiento de compras de clientes 
 * por parte de dos cajeras. 
 * <br>
 * 
 * @author Miguel Ángel Arias Castaño
 */
public class ClienteCajeraMain {

    /**
     * Método principal que ejecuta el procesamiento de compras por las cajeras.
     * 
     */
    public static void main(String[] args) {
    	
        // Crear lista de productos
        List<Producto> productos = new ArrayList<>();
        setProductos(productos);

        // Crear clientes con sus respectivos productos
        ProductoCliente cliente1 = new ProductoCliente("Sofía", productos);
        ProductoCliente cliente2 = new ProductoCliente("Luis", productos);

        // Tiempo inicial de procesamiento
        long initialTime = System.currentTimeMillis();

        // Crear cajeras
        ProductoCajera cajera1 = new ProductoCajera("Ana");
        ProductoCajera cajera2 = new ProductoCajera("María");

        // Procesar compras de los clientes
        cajera1.procesarCompra(cliente1, initialTime);
        cajera2.procesarCompra(cliente2, initialTime);
    }

    /**
     * Método encargado de agregar productos a una lista de productos.
     *
     * @param productos Lista de productos a la que se agregarán nuevos productos.
     */
    private static void setProductos(List<Producto> productos) {
        // Crear productos
        Producto producto1 = new Producto("Manzanas", 1.5f, 5);
        Producto producto2 = new Producto("Leche", 3.2f, 2);
        Producto producto3 = new Producto("Pan", 1.0f, 3);

        // Agregar productos a la lista
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
    }
}
