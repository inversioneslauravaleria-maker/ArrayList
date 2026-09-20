package Arraylist_Sistema_inventario_Aguadas;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist_Sistema_inventario_Aguadas {

    public static Scanner sc;
    public static ArrayList<String> ListaProductos = new ArrayList<>();
    public static int opcion = 0;

    public static void main(String[] args) {

        sc = new Scanner(System.in);

        System.out.println("--- Bienvenido al sistema de registro de inventario ---");
        System.out.println("Ingrese 5 productos:");

        // Solicitar 5 productos
        for (int i = 0; i < 5; i++) {

            System.out.println("Producto #" + (i + 1) + ":");
            String nombreProducto = sc.nextLine();

            ListaProductos.add(nombreProducto);
        }

        // Menú
        do {

            System.out.println("\n¿Qué desea hacer?");
            System.out.println("1. Ver Productos");
            System.out.println("2. Agregar Producto");
            System.out.println("3. Editar Producto");
            System.out.println("4. Eliminar Producto");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            System.out.println("***************");

            switch (opcion) {

                case 1:
                    verProductos();
                    break;

                case 2:
                    agregarProducto();
                    break;

                case 3:
                    editarProducto();
                    break;

                case 4:
                    eliminarProducto();
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida.");
                    break;
            }

        } while (opcion != 0);

        System.out.println("Fin del programa, gracias.");

        sc.close();
    }

    // Mostrar productos
    public static void verProductos() {

        System.out.println("\n--- LISTA DE PRODUCTOS ---");

        for (int i = 0; i < ListaProductos.size(); i++) {

            System.out.println((i + 1) + ". " + ListaProductos.get(i));
        }
    }

    // Agregar producto
    public static void agregarProducto() {

        System.out.print("Ingrese el nuevo producto: ");
        String producto = sc.nextLine();

        ListaProductos.add(producto);
        System.out.println("Producto agregado correctamente.");
    }

    // Editar producto
    public static void editarProducto() {

        verProductos();

        System.out.print("Ingrese el número del producto que desea editar: ");
        int posicion = sc.nextInt();
        sc.nextLine();

        if (posicion >= 1 && posicion <= ListaProductos.size()) {

            System.out.print("Ingrese el nuevo nombre del producto: ");
            String nuevoProducto = sc.nextLine();

            ListaProductos.set(posicion - 1, nuevoProducto);

            System.out.println("Producto editado correctamente.");

        } else {

            System.out.println("Posición inválida.");
        }
    }

    // Eliminar producto
    public static void eliminarProducto() {

        verProductos();

        System.out.print("Ingrese el número del producto que desea eliminar: ");
        int posicion = sc.nextInt();
        sc.nextLine();

        if (posicion >= 1 && posicion <= ListaProductos.size()) {

            ListaProductos.remove(posicion - 1);

            System.out.println("Producto eliminado correctamente.");
        } else {
            System.out.println("Posición inválida.");
        }
    }
}
