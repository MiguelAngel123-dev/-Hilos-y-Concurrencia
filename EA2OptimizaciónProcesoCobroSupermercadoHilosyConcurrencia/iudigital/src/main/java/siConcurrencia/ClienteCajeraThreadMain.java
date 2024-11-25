package siConcurrencia;

import java.util.ArrayList;
import java.util.List;

import cliente.Producto;
import cliente.ProductoCliente;

/**
 * <b>Descripción:</b> Clase principal que simula el procesamiento de compras de clientes utilizando múltiples hilos. 
 * <br>
 * 
 * <b>Propósito:</b> Ejemplo práctico de cómo utilizar hilos en Java para ejecutar tareas en paralelo.
 * 
 * @author Miguel Ángel Arias Castaño
 */
public class ClienteCajeraThreadMain {

    /**
     * Método principal encargado de iniciar el procesamiento concurrente de compras por las cajeras.
     *
     */
    public static void main(String[] args) {

        // Lista de productos disponibles
        List<Producto> productos = new ArrayList<>();
        setProductos(productos);

        // Crear clientes con sus respectivos productos
        ProductoCliente cliente1 = new ProductoCliente("Sofía", productos);
        ProductoCliente cliente2 = new ProductoCliente("Luis", productos);

        // Tiempo inicial de procesamiento
        long initialTime = System.currentTimeMillis();

        // Crear cajeras y asignarles clientes
        ProductoCajeraThread cajera1 = new ProductoCajeraThread("Ana", cliente1, initialTime);
        ProductoCajeraThread cajera2 = new ProductoCajeraThread("María", cliente2, initialTime);

        // Iniciar procesamiento en paralelo
        cajera1.start();
        cajera2.start();
    }

    /**
     * Método encargado de inicializar una lista de productos con ejemplos específicos.
     *
     * @param productos Lista donde se agregarán los productos creados.
     */
    private static void setProductos(List<Producto> productos) {

        // Crear productos con nombres, precios y cantidades
        Producto producto1 = new Producto("Manzanas", 1.5f, 5);
        Producto producto2 = new Producto("Leche", 3.2f, 2);
        Producto producto3 = new Producto("Pan", 1.0f, 3);

        // Agregar productos a la lista
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
    }
}
