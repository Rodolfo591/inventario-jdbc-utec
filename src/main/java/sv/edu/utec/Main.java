/**
 * UNIVERSIDAD TECNOLÓGICA DE EL SALVADOR
 * Facultad de Informática y Ciencias Aplicadas
 * Asignatura: Programación III
 * Proyecto: Sistema de Gestión de Inventario (JDBC + H2)
 *
 * Integrantes:
 *  - Rodolfo Adalí Santamaría Castillo - 25-3822-2022
 *  - Pablo Enrique Castro Vásquez - 25-2312-2022
 *  - Joaquín Enrique Chávez Cuéllar - 25-4018-2018
 */
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

        // Asegura que la tabla de la base de datos exista al iniciar
        dao.crearTabla();

        int opcion = 0;

        do {
            System.out.println("\n========================================");
            System.out.println("   SISTEMA DE INVENTARIO - PROG III");
            System.out.println("========================================");
            System.out.println("1. Agregar nuevo producto");
            System.out.println("2. Listar todos los productos");
            System.out.println("3. Actualizar producto");
            System.out.println("4. Eliminar producto");
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
                    System.out.println("\n--- ACTUALIZAR PRODUCTO ---");
                    System.out.print("Ingrese el ID del producto a actualizar: ");
                    int idActualizar = 0;
                    if (scanner.hasNextInt()) {
                        idActualizar = scanner.nextInt();
                        scanner.nextLine();
                    } else {
                        System.out.println("⚠️ ID no válido. Operación cancelada.");
                        scanner.nextLine();
                        break;
                    }

                    System.out.print("Ingrese el nuevo nombre del producto: ");
                    String nuevoNombre = scanner.nextLine();

                    System.out.print("Ingrese la nueva cantidad: ");
                    int nuevaCantidad = 0;
                    if (scanner.hasNextInt()) {
                        nuevaCantidad = scanner.nextInt();
                        scanner.nextLine();
                    } else {
                        System.out.println("⚠️ Cantidad no válida. Operación cancelada.");
                        scanner.nextLine();
                        break;
                    }

                    Producto productoActualizar = new Producto(idActualizar, nuevoNombre, nuevaCantidad);
                    boolean actualizado = dao.actualizar(productoActualizar);

                    if (actualizado) {
                        System.out.println("✅ Producto actualizado exitosamente.");
                    } else {
                        System.out.println("⚠️ No se encontró ningún producto con el ID: " + idActualizar);
                    }
                    break;

                case 4:
                    System.out.println("\n--- ELIMINAR PRODUCTO ---");
                    System.out.print("Ingrese el ID del producto a eliminar: ");
                    int idEliminar = 0;
                    if (scanner.hasNextInt()) {
                        idEliminar = scanner.nextInt();
                        scanner.nextLine();
                    } else {
                        System.out.println("⚠️ ID no válido. Operación cancelada.");
                        scanner.nextLine();
                        break;
                    }

                    boolean eliminado = dao.eliminar(idEliminar);

                    if (eliminado) {
                        System.out.println("✅ Producto eliminado exitosamente de la base de datos.");
                    } else {
                        System.out.println("⚠️ No se encontró ningún producto con el ID: " + idEliminar);
                    }
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