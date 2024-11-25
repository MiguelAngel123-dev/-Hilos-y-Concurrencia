package cliente;

/**
 * <b> Descripcion:</b> Clase que determina los productos que el cliente va a comprar 
 * <br>
 * 
 * @author Miguel Ángel Arias Castaño
 * 
 */
public class Producto {
    /*
     * Atributo que determina el nombre del producto
     */
    private String nombre;
    /*
     * Atributo que determina el precio del producto
     */
    private float precio;
    /*
     * Atributo que determina la cantidad de productos
     */
    private int cantidad;

    /*
     * Constructor de la clase Producto.
     * 
     * @param nombre  Nombre del producto.
     * @param precio  Precio del producto.
     * @param cantidad Cantidad disponible del producto.
     */
    public Producto(String nombre, float precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    /**
     * Encargado de retornar el valor del atributo nombre.
     *
     * @return El nombre del producto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Encargado de modificar el valor del atributo nombre.
     *
     * @param nombre El nuevo nombre del producto.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Encargado de retornar el valor del atributo precio.
     *
     * @return El precio del producto.
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * Encargado de modificar el valor del atributo precio.
     *
     * @param precio El nuevo precio del producto.
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * Encargado de retornar el valor del atributo cantidad.
     *
     * @return La cantidad disponible del producto.
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Encargado de modificar el valor del atributo cantidad.
     *
     * @param cantidad La nueva cantidad disponible del producto.
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
