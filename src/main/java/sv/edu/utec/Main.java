package sv.edu.utec;

import sv.edu.utec.datos.ProductoDAO;
import sv.edu.utec.modelo.Producto;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        ProductoDAO dao = new ProductoDAO();

        try {
            // Inicializar tabla
            dao.crearTabla();
            System.out.println("Base de datos e interfaz listas.\n");

            // Create
            System.out.println("--- Insertando Productos ---");
            dao.insertar(new Producto("Teclado Mecánico", 15));
            dao.insertar(new Producto("Monitor 24 Pulgadas", 8));

            // Read
            System.out.println("\n--- Registros Actuales ---");
            dao.listar().forEach(System.out::println);

            // Update
            System.out.println("\n--- Actualizando ID 1 ---");
            dao.actualizar(new Producto(1, "Teclado Mecánico RGB", 20));

            // Delete
            System.out.println("\n--- Eliminando ID 2 ---");
            dao.eliminar(2);

            // Read Final
            System.out.println("\n--- Registros Finales ---");
            dao.listar().forEach(System.out::println);

        } catch (SQLException e) {
            System.err.println("Error en la operación de datos: " + e.getMessage());
        }
    }
}