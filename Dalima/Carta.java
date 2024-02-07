package Dalima;
import java.util.Scanner;

public class Carta {
    public static int tamPedido;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] platos = {
            "Montadito Nikkei",
            "Ostra de Leche de Tigre",
            "Ceviche Clásico",
            "Ceviche de Puerto",
            "Tiradito de Salmón Apasionado",
            "Causa de Pollo Criollo",
            "Causa de Pesca Ahumada Nikkei",
            "Croqueta de Pulpo",
            "Croqueta de Ají de Gallina",
            "'Jalea' de Calamar con Tártara Limeña",
            "Sánguche de Chicharrón",
            "Curry Peruano de Pescado",
            "'Seco de Pato' Homenaje Norteño",
            "Udón de Lomo Salteado con un Toque Nikkei",
            "Tres Leches",
            "Chocolate, Mandarina y Pasión",
            "Tarta de Queso con Guanábana"
        };

        double[] precios = {
            6,
            3.5,
            16.5,
            16.5,
            10.5,
            10.8,
            10.8,
            3.5,
            3.5,
            9,
            9,
            16.8,
            18,
            16.8,
            6.5,
            6.5,
            6.5
        };

        System.out.println("");
        System.out.println("                            BIENVENIDO A DALIMA");
        System.out.println("");
        System.out.println("");
        System.out.println("                               *** CARTA ***");
        System.out.println("");
        System.out.println("");
        System.out.println("                           LOS PLATILLOS FRESCOS");
        System.out.println("");
        System.out.println("[1] Montadito Nikkei ---------------------------------------------------- 6.00 $");
        System.out.println("Tartar de pesca del día, alga nori crispy y emulsión acevichada 2 uds");
        System.out.println("");
        System.out.println("[2] Ostra de Leche de Tigre --------------------------------------------- 3.50 $");
        System.out.println("Ostra de temporada con un toque peruano");
        System.out.println("");
        System.out.println("[3] Ceviche Clásico ----------------------------------------------------- 16.50 $");
        System.out.println("Pesca del día, boniato, leche de tigre");
        System.out.println("");
        System.out.println("[4] Ceviche de Puerto --------------------------------------------------- 16.50 $");
        System.out.println("Pesca del día, pulpo y gambón cocido, aguacate, maíz de choclo, boniato,");
        System.out.println("leche de tigre de vieiras y ají amarillo");
        System.out.println("");
        System.out.println("[5] Tiradito de Salmón Apasionado --------------------------------------- 10.50 $");
        System.out.println("Láminas de salmón curado, agridulce de fruta de la pasión y ají limo");
        System.out.println("");
        System.out.println("");
        System.out.println("                             LAS BUENAS CAUSAS");
        System.out.println("");
        System.out.println("[6] Causa de Pollo Criollo ---------------------------------------------- 10.80 $");
        System.out.println("Causa de pollo tierno marinado en ají panca, achiote y salsa tártara");
        System.out.println("");
        System.out.println("[7] Causa de Pesca Ahumada Nikkei --------------------------------------- 10.80 $");
        System.out.println("Causa, mayonesa nikkei y aguacate");
        System.out.println("");
        System.out.println("");
        System.out.println("                                  FREIDURIA");
        System.out.println("");
        System.out.println("[8] Croqueta de Pulpo --------------------------------------------------- 3.50 $");
        System.out.println("Pulpo anticuchero al miso");
        System.out.println("");
        System.out.println("[9] Croqueta de Ají de Gallina ------------------------------------------ 3.50 $");
        System.out.println("Guiso al ají y grana padano");
        System.out.println("");
        System.out.println("[10] 'Jalea' de Calamar con Tártara Limeña ------------------------------ 9.00 $");
        System.out.println("Calamar marinado y rebozado crujiente");
        System.out.println("");
        System.out.println("[11] Sánguche de Chicharrón --------------------------------------------- 9.00 $");
        System.out.println("Bocadillo de panceta a baja tempura y frita, boniato y criolla");
        System.out.println("");
        System.out.println("");
        System.out.println("                           CALENTITOS & SABROSOS");
        System.out.println("");
        System.out.println("[12] Curry Peruano de Pescado ------------------------------------------- 16.80 $");
        System.out.println("Curry de ajíes, arroz con choclo");
        System.out.println("");
        System.out.println("[13] 'Seco de Pato' Homenaje Norteño ------------------------------------ 18.00 $");
        System.out.println("Magret, orzo cremoso, calabaza, shitake y quinoa crispy");
        System.out.println("");
        System.out.println("[14] Udón de Lomo Salteado con un Toque Nikkei -------------------------- 16.80 $");
        System.out.println("Pasta al wok, ternera y verduras");
        System.out.println("");
        System.out.println("");
        System.out.println("                                   DULCES");
        System.out.println("");
        System.out.println("[15] Tres Leches -------------------------------------------------------- 6.50 $");
        System.out.println("Receta de la abuela de Richi con oporto y helado de leche merengada");
        System.out.println("");
        System.out.println("[16] Chocolate, Mandarina y Pasión -------------------------------------- 6.50 $");
        System.out.println("Brownie, mousse de cacao, helado de mandarina y miel de maracuyá");
        System.out.println("");
        System.out.println("[17] Tarta de Queso con Guanábana --------------------------------------- 6.50 $");
        System.out.println("Quesos, guanábara y helado de mascarpone");
        System.out.println("");

        String[] pedido = pedido(scanner, platos);
        double total = cuenta(platos, precios, pedido);

        System.out.println("");
        System.out.println("Platos pedidos:");
        for (String plato : pedido) {
            System.out.println(plato);
        }        
        
        System.out.println("");
        System.out.println("¿Está todo correcto? (s/n)");
        String respuesta = scanner.next();
        if (respuesta.equalsIgnoreCase("n")) {      // Acepta "N" y "n"
            pedido = pedido(scanner, platos);
            System.out.println("Platos pedidos:");
            for (String plato : pedido) {
                System.out.println(plato);
            }
        }
        // Si todo está correcto, nada ocurre

        System.out.println("");
        System.out.println("Subtotal: " + String.format("%.2f", total) + " $");  // 2 casas decimales
    
        double tasaServicio = total * 0.18;
        System.out.println("Tasa de servicio: " + String.format("%.2f", tasaServicio) + " $");

        double totalConServicio = total + tasaServicio;
        System.out.println("Total a pagar: " + String.format("%.2f", totalConServicio) + " $");
    }

    public static String[] pedido(Scanner scanner, String[] platos) {
        System.out.println("¿Cuántos platos te gustaría pedir?");
        tamPedido = scanner.nextInt();

        String[] pedido = new String[tamPedido];

        System.out.println("");
        System.out.println("Introduce los valores correspondientes a los platos:");

        for(int i = 0; i < tamPedido; i++) {
            int elección = scanner.nextInt();
            if (elección >= 1 && elección <= platos.length) {
            // Al menos una elección, debe estar en la carta
                pedido[i] = platos[elección - 1];
            }
            else {
                System.out.println("Plato no válido, por favor introduce un número entre 1 y 14");
                i--;            // Para que el usuário pueda inserir nuevamente la elección correcta
            }
        }

        return pedido;
    }

    public static double cuenta(String[] platos, double[] precios, String[] pedido) {
        double total = 0;

        for(String plato : pedido) {
            for(int i = 0; i < platos.length; i++) { 
                if (plato.equals(platos[i])) {
                    total += precios[i];
                    break;
                }
            }
        }

        return total;
    }
}
