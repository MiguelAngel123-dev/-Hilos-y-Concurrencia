package cliente;

import java.util.List;

/**
 * <b>Descripción:</b> Clase que asocia un cliente con su lista de productos.
 * <br>
 * Esta clase permite almacenar el nombre de un cliente y la lista de productos que tiene asociados.
 * 
 * @author Miguel Ángel Arias Castaño
 */
public class ProductoCliente {

    /**
     * Nombre del cliente.
     */
    private final String nombre;

    /**
     * Lista de productos asociados al cliente.
     */
    private final List<Producto> productos;

    /**
     * Constructor de la clase ProductoCliente.
     *
     * @param nombre Nombre del cliente.
     * @param productos Lista de productos asociados al cliente.
     */
    public ProductoCliente(String nombre, List<Producto> productos) {
        this.nombre = nombre;
        this.productos = productos;
    }

    /**
     * Encargado de retornar el valor del atributo nombre.
     *
     * @return El nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Encargado de retornar el valor del atributo productos.
     *
     * @return La lista de productos asociados al cliente.
     */
    public List<Producto> getProductos() {
        return productos;
    }
}
