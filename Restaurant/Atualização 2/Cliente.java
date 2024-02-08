package Dalima;  

public class Cliente {
    private String nombre;
    private String correo;
    private String telefono;
    private String direccion;

    public Cliente(String n, String c, String t, String d) {
        this.nombre = n;
        this.correo = c;
        this.telefono = t;
        this.direccion = d;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }
}
