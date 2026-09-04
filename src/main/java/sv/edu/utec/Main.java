package sv.edu.utec;

import sv.edu.utec.datos.ProductoDAO;
import sv.edu.utec.modelo.Producto;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        ProductoDAO dao = new ProductoDAO();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n========================================");
            System.out.println("   SISTEMA DE INVENTARIO - PROG III");
            System.out.println("========================================");
            System.out.println("1. Agregar nuevo producto");
            System.out.println("2. Listar todos los productos");
            System.out.println("3. Actualizar producto (Asignado a Pablo)");
            System.out.println("4. Eliminar producto (Asignado a Compañero 3)");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar buffer
            } else {
                System.out.println("⚠️ Error: Debe ingresar un número entero válido.");
                scanner.nextLine();
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.println("\n--- AGREGAR NUEVO PRODUCTO ---");
                    System.out.print("Ingrese nombre del producto: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Ingrese cantidad: ");
                    int cantidad = 0;
                    if (scanner.hasNextInt()) {
                        cantidad = scanner.nextInt();
                        scanner.nextLine();
                    } else {
                        System.out.println("⚠️ Cantidad no válida. Registro cancelado.");
                        scanner.nextLine();
                        break;
                    }

                    Producto nuevo = new Producto(nombre, cantidad);
                    dao.insertar(nuevo);
                    System.out.println("✅ Producto registrado exitosamente en la base de datos.");
                    break;

                case 2:
                    System.out.println("\n--- LISTA DE PRODUCTOS REGISTRADOS ---");
                    List<Producto> productos = dao.listar();
                    if (productos.isEmpty()) {
                        System.out.println("No hay productos disponibles en la base de datos.");
                    } else {
                        for (Producto p : productos) {
                            System.out.println(p);
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n [Módulo de Actualización - Pendiente por Pablo]");
                    break;

                case 4:
                    System.out.println("\n [Módulo de Eliminación - Pendiente por Integrante 3]");
                    break;

                case 5:
                    System.out.println("\nSaliendo del sistema de inventario... ¡Hasta luego!");
                    break;

                default:
                    System.out.println("⚠️ Opción no válida. Por favor, seleccione un número del 1 al 5.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}