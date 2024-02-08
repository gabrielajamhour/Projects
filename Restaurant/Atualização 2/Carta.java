package Dalima; 
import java.util.ArrayList;
import java.util.List;

public class Carta {
    private List<Plato> platos;             // Array del tipo Platos, no hace falta definir su tamaÃ±o (ilimitado)

    public Carta() {
        this.platos = new ArrayList<>();    // Definimos platos como un nuevo Array
    }

    public void adicionarPlato(String nombre, String descripcion, double precio) {
        Plato nuevoPlato = new Plato(nombre, descripcion, precio);
        platos.add(nuevoPlato);             // Adiciona nuevo plato al Array
    }

    public void verCarta() {
        System.out.println("Carta:");
        for(int i = 0; i < platos.size(); i++) {    //
            Plato plato = platos.get(i);            //
            System.out.println("[" + (i+1) + "] " + plato.getNombre());
            System.out.println(plato.getDescripcion() + " - " + String.format("%.2f", plato.getPrecio()) + "€");
        }
    }
}
