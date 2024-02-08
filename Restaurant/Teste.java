import java.util.Scanner;

public class Teste {
    public static int tamPedido;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] platos = {
            "Montadito Nikkei",
            "Ostra de Leche de Tigre",
            "Ceviche Cl�sico",
            "Ceviche de Puerto",
            "Tiradito de Salm�n Apasionado",
            "Causa de Pollo Criollo",
            "Causa de Pesca Ahumada Nikkei",
            "Croqueta de Pulpo",
            "Croqueta de Aj� de Gallina",
            "'Jalea' de Calamar con T�rtara Lime�a",
            "S�nguche de Chicharr�n",
            "Curry Peruano de Pescado",
            "'Seco de Pato' Homenaje Norte�o",
            "Ud�n de Lomo Salteado con un Toque Nikkei",
            "Tres Leches",
            "Chocolate, Mandarina y Pasi�n",
            "Tarta de Queso con Guan�bana"
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
        System.out.println("Tartar de pesca del d�a, alga nori crispy y emulsi�n acevichada 2 uds");
        System.out.println("");
        System.out.println("[2] Ostra de Leche de Tigre --------------------------------------------- 3.50 $");
        System.out.println("Ostra de temporada con un toque peruano");
        System.out.println("");
        System.out.println("[3] Ceviche Cl�sico ----------------------------------------------------- 16.50 $");
        System.out.println("Pesca del d�a, boniato, leche de tigre");
        System.out.println("");
        System.out.println("[4] Ceviche de Puerto --------------------------------------------------- 16.50 $");
        System.out.println("Pesca del d�a, pulpo y gamb�n cocido, aguacate, ma�z de choclo, boniato,");
        System.out.println("leche de tigre de vieiras y aj� amarillo");
        System.out.println("");
        System.out.println("[5] Tiradito de Salm�n Apasionado --------------------------------------- 10.50 $");
        System.out.println("L�minas de salm�n curado, agridulce de fruta de la pasi�n y aj� limo");
        System.out.println("");
        System.out.println("");
        System.out.println("                             LAS BUENAS CAUSAS");
        System.out.println("");
        System.out.println("[6] Causa de Pollo Criollo ---------------------------------------------- 10.80 $");
        System.out.println("Causa de pollo tierno marinado en aj� panca, achiote y salsa t�rtara");
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
        System.out.println("[9] Croqueta de Aj� de Gallina ------------------------------------------ 3.50 $");
        System.out.println("Guiso al aj� y grana padano");
        System.out.println("");
        System.out.println("[10] 'Jalea' de Calamar con T�rtara Lime�a ------------------------------ 9.00 $");
        System.out.println("Calamar marinado y rebozado crujiente");
        System.out.println("");
        System.out.println("[11] S�nguche de Chicharr�n --------------------------------------------- 9.00 $");
        System.out.println("Bocadillo de panceta a baja tempura y frita, boniato y criolla");
        System.out.println("");
        System.out.println("");
        System.out.println("                           CALENTITOS & SABROSOS");
        System.out.println("");
        System.out.println("[12] Curry Peruano de Pescado ------------------------------------------- 16.80 $");
        System.out.println("Curry de aj�es, arroz con choclo");
        System.out.println("");
        System.out.println("[13] 'Seco de Pato' Homenaje Norte�o ------------------------------------ 18.00 $");
        System.out.println("Magret, orzo cremoso, calabaza, shitake y quinoa crispy");
        System.out.println("");
        System.out.println("[14] Ud�n de Lomo Salteado con un Toque Nikkei -------------------------- 16.80 $");
        System.out.println("Pasta al wok, ternera y verduras");
        System.out.println("");
        System.out.println("");
        System.out.println("                                   DULCES");
        System.out.println("");
        System.out.println("[15] Tres Leches -------------------------------------------------------- 6.50 $");
        System.out.println("Receta de la abuela de Richi con oporto y helado de leche merengada");
        System.out.println("");
        System.out.println("[16] Chocolate, Mandarina y Pasi�n -------------------------------------- 6.50 $");
        System.out.println("Brownie, mousse de cacao, helado de mandarina y miel de maracuy�");
        System.out.println("");
        System.out.println("[17] Tarta de Queso con Guan�bana --------------------------------------- 6.50 $");
        System.out.println("Quesos, guan�bara y helado de mascarpone");
        System.out.println("");

        String[] pedido = pedido(scanner, platos);
        double total = cuenta(platos, precios, pedido);

        System.out.println("");
        System.out.println("Platos pedidos:");
        for (String plato : pedido) {
            System.out.println(plato);
        }        
        
        System.out.println("");
        System.out.println("�Est� todo correcto? (s/n)");
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
        System.out.println("�Cu�ntos platos te gustar�a pedir?");
        tamPedido = scanner.nextInt();

        String[] pedido = new String[tamPedido];

        System.out.println("");
        System.out.println("Introduce los valores correspondientes a los platos:");

        for(int i = 0; i < tamPedido; i++) {
            int eleccion = scanner.nextInt();
            if (eleccion >= 1 && eleccion <= platos.length) {
            // Al menos una elecci�n, debe estar en la carta
                pedido[i] = platos[eleccion - 1];
            }
            else {
                System.out.println("Plato no v�lido, por favor introduce un n�mero entre 1 y 14");
                i--;            // Para que el usu�rio pueda inserir nuevamente la elecci�n correcta
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
