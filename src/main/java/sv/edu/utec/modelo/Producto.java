package sv.edu.utec.modelo;

public class Producto
{
    private int id;
    private String nombre;
    private int cantidad;

    // Constructor sin ID (para inserciones)
    public Producto(String nombre, int cantidad)
    {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    // Constructor completo (para lecturas de BD)
    public Producto(int id, String nombre, int cantidad)
    {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    // Getters y Setters
    public int getId() { return id;
    }
    public void setId(int id) { this.id = id;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    @Override
    public String toString()
    {
        return String.format("ID: %-4d | Producto: %-25s | Cantidad: %-5d", id, nombre, cantidad);
    }
}