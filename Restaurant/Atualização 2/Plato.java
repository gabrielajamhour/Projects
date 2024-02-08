package Dalima;  

public class Plato {
    private String nombre;
    private String descripcion;
    private double precio;

    public Plato(String n, String d, double p) {
        this.nombre = n;
        this.descripcion = d;
        this.precio = p;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }
}
