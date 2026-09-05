# Sistema de Gestión de Inventario (JDBC + H2)

Proyecto desarrollado para la asignatura de **Programación III** en la **Universidad Tecnológica de El Salvador**. Consiste en un sistema de consola para la gestión de productos, utilizando el patrón de diseño DAO (Data Access Object), persistencia de datos con JDBC y la base de datos embebida H2.

---

## 👥 Integrantes del Equipo

* **Rodolfo Adalí Santamaría Castillo** - `25-3822-2022`
* **Pablo Enrique Castro Vásquez** - `25-2312-2022`
* **Joaquín Enrique Chávez Cuéllar** - `25-4018-2018`

---

## 🚀 Funcionalidades

El sistema permite realizar el ciclo completo de operaciones **CRUD** sobre los productos:

1. **Crear (Create):** Registro de nuevos productos con nombre y cantidad.
2. **Leer (Read):** Listado completo de todos los productos registrados en la base de datos.
3. **Actualizar (Update):** Modificación del nombre y la cantidad de un producto existente mediante su ID.
4. **Eliminar (Delete):** Remoción de registros de la base de datos indicando el ID.

---

## 🛠️ Tecnologías Utilizadas

* **Lenguaje:** Java (JDK 17+)
* **Base de Datos:** H2 Database (modo embebido)
* **Conectividad:** JDBC (Java Database Connectivity)
* **Gestor de Dependencias:** Apache Maven
* **IDE:** IntelliJ IDEA

---

## 📋 Requisitos Previos e Instalación

1. Clonar el repositorio:
   ```bash
   git clone [https://github.com/Rodolfo591/inventario-jdbc-utec.git](https://github.com/Rodolfo591/inventario-jdbc-utec.git)