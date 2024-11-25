package noConcurrencia;

import cliente.Producto;
import cliente.ProductoCliente;

/**
 * <b>Descripción:</b> Clase que determina el cobro de los productos al cliente. 
 * <br>
 * 
 * @author Miguel Ángel Arias Castaño
 */
public class ProductoCajera {

    /**
     * Nombre de la cajera.
     */
    private final String nombre;

    /**
     * Constructor de la clase ProductoCajera.
     *
     * @param nombre Nombre de la cajera.
     */
    public ProductoCajera(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Encargado de procesar la compra de un cliente, mostrando los detalles de cada producto y el tiempo de procesamiento.
     *
     * @param cliente   Cliente que realiza la compra.
     * @param timeStamp Tiempo inicial del procesamiento.
     */
    public void procesarCompra(ProductoCliente cliente, long timeStamp) {
        System.out.println("La cajera " + this.nombre +
                " comienza a procesar la compra del cliente " +
        		cliente.getNombre() + " en el tiempo: " +
                (System.currentTimeMillis() - timeStamp) / 1000 + " segundos\n");

        int conteoCliente = 1;
        double totalCompra = 0.0;

        for (Producto producto : cliente.getProductos()) {
            esperarXsegundos();
            double costoProducto = producto.getCantidad() * producto.getPrecio();
            totalCompra += costoProducto;

            System.out.println("Producto " + conteoCliente++ + ":");
            System.out.println(" - Nombre: " + producto.getNombre());
            System.out.println(" - Precio unitario: $" + producto.getPrecio());
            System.out.println(" - Cantidad: " + producto.getCantidad());
            System.out.println(" - Costo total del producto: $" + costoProducto);
            System.out.println("Tiempo transcurrido: " +
                    (System.currentTimeMillis() - timeStamp) / 1000 + " segundos\n");
        }

        System.out.println("La cajera " + this.nombre +
                " ha terminado de procesar la compra del cliente " +
                cliente.getNombre() + " en el tiempo: " +
                (System.currentTimeMillis() - timeStamp) / 1000 + " segundos");
        System.out.println("Monto total de la compra: $" + totalCompra);
    }

    /**
     * Simula la espera de un segundo, representando el tiempo de procesamiento de un producto.
     */
    private void esperarXsegundos() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Error: el hilo fue interrumpido.");
        }
    }
}
