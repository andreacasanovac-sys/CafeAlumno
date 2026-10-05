package modelo;

public class Articulo {
    private String producto;
    private int precio;

    public Articulo(String producto, int precio) {
        this.producto = producto;
        this.precio = precio;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        if(precio <= 0){
            System.err.println("Precio no válido. Intentar de nuevo");
            return;
        }
        this.precio = precio;
    }
    
}
