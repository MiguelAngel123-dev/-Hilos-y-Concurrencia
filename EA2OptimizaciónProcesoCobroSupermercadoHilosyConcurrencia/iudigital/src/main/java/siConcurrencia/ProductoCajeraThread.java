package siConcurrencia;

import cliente.Producto;
import cliente.ProductoCliente;

public class ProductoCajeraThread extends Thread{
	
	/**
     * Nombre de la cajera.
     */
    private final String nombre;
    
    /**
     * atributo cliente al que se le va a procesar la compra
     */
    private ProductoCliente cliente;
    
    /**
     * tiempo inicial del proceso
     */
    
    private long initialTime;

	public ProductoCajeraThread(String nombre, ProductoCliente cliente, long initialTime) {
		this.nombre = nombre;
		this.cliente = cliente;
		this.initialTime = initialTime;
	}

    public void run () {
    	System.out.println("La cajera " + this.nombre +
                " comienza a procesar la compra del cliente " +
        		cliente.getNombre() + " en el tiempo: " +
                (System.currentTimeMillis() - initialTime) / 1000 + " segundos\n");
    	
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
                     (System.currentTimeMillis() - initialTime) / 1000 + " segundos\n");
         }
         System.out.println("La cajera " + this.nombre +
                 " ha terminado de procesar la compra del cliente " +
                 cliente.getNombre() + " en el tiempo: " +
                 (System.currentTimeMillis() - initialTime) / 1000 + " segundos");
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
