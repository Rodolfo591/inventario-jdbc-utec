# Sistema de Gestión de Inventario (JDBC + H2)

Sistema de gestión de inventarios basado en consola desarrollado con Java, JDBC y base de datos H2. Aplica la arquitectura DAO para realizar operaciones de creación, lectura, actualización y eliminación (CRUD) de productos.

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
   `git clone https://github.com/Rodolfo591/inventario-jdbc-utec.git`
2. Abrir el proyecto en IntelliJ IDEA.
3. Cargar las dependencias de Maven (`pom.xml`).
4. Ejecutar la clase `Main.java` ubicada en `src/main/java/sv/edu/utec/Main.java`.

---

## 🤖 Uso de Inteligencia Artificial

Para el desarrollo de este proyecto se utilizaron herramientas de Inteligencia Artificial (Gemini / ChatGPT) con los siguientes fines:

* **Asistencia en lógica y depuración:** Consultas puntuales sobre el manejo de sintaxis en JDBC, estructuras de consultas SQL para H2 y manejo de excepciones (`SQLException`).
* **Estructuración de documentación:** Apoyo en la redacción y formato del archivo `README.md` y organización del flujo de comandos Git.
* **Validación de código:** Revisión del patrón DAO para asegurar buenas prácticas de programación en Java.