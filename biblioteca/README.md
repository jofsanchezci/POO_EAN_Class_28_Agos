
# Proyecto de Gestión de Inventarios para una Biblioteca

## Descripción del Proyecto

Este proyecto implementa un sistema de gestión de inventarios para una biblioteca, utilizando principios de Programación Orientada a Objetos (POO) en Java. El sistema permite gestionar materiales como libros y revistas, manejar préstamos y devoluciones, y generar reportes de inventario.

## Estructura del Proyecto

El proyecto sigue una estructura de paquetes organizada para mantener el código modular y fácil de mantener:

```
biblioteca/
├── src/
│   └── com/
│       └── ejemplo/
│           └── biblioteca/
│               ├── Material.java
│               ├── Libro.java
│               ├── Revista.java
│               ├── Usuario.java
│               ├── Reportable.java
│               ├── Biblioteca.java
│               └── SistemaBiblioteca.java
└── build/
```

### Descripción de las Clases

- **Material.java**: Clase abstracta que representa un material genérico en la biblioteca. Contiene atributos comunes como título, autor, año de publicación y disponibilidad.
- **Libro.java**: Subclase de `Material` que representa un libro. Añade atributos específicos como el número de páginas y el ISBN.
- **Revista.java**: Subclase de `Material` que representa una revista. Añade el atributo `numeroEdicion`.
- **Usuario.java**: Clase que representa a un usuario de la biblioteca. Maneja los materiales que el usuario ha prestado.
- **Reportable.java**: Interfaz que define un método `generarReporte()` para clases que necesiten generar reportes.
- **Biblioteca.java**: Clase principal que maneja la gestión de materiales y usuarios en la biblioteca. Implementa la interfaz `Reportable`.
- **SistemaBiblioteca.java**: Clase principal con el método `main` para ejecutar el sistema de gestión de la biblioteca.

## Ejecución del Proyecto

### Paso 1: Compilar el Código

Desde el directorio raíz del proyecto (donde se encuentra la carpeta `src`), ejecuta el siguiente comando para compilar el código:

```bash
javac -d build src/com/ejemplo/biblioteca/*.java
```

Este comando compilará los archivos `.java` y generará los archivos `.class` correspondientes en la carpeta `build`, manteniendo la estructura del paquete.

### Paso 2: Ejecutar el Programa

Una vez compilado, navega al directorio `build` y ejecuta el siguiente comando para ejecutar el programa principal:

```bash
java com.ejemplo.biblioteca.SistemaBiblioteca
```

## Ejemplos de Uso

### 1. Crear un Libro y Mostrar sus Detalles

```java
Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 1967, 417, "978-0307474728");
libro1.mostrarDetalles();
```

**Salida esperada:**

```
Libro: Cien Años de Soledad por Gabriel García Márquez (1967)
Páginas: 417, ISBN: 978-0307474728
```

### 2. Prestar un Libro a un Usuario

```java
Usuario usuario1 = new Usuario("Juan Pérez", "JP123");
usuario1.prestarMaterial(libro1);
```

**Salida esperada:**

```
El material ha sido prestado.
```

### 3. Generar un Reporte de Inventario

```java
Biblioteca biblioteca = new Biblioteca();
biblioteca.agregarMaterial(libro1);
biblioteca.generarReporte();
```

**Salida esperada:**

```
Reporte de Inventario:
Libro: Cien Años de Soledad por Gabriel García Márquez (1967)
Páginas: 417, ISBN: 978-0307474728
Disponible: false
```

## Conclusión

Este proyecto es un ejemplo de cómo aplicar conceptos de Programación Orientada a Objetos en Java para desarrollar un sistema de gestión de inventarios modular y escalable. El código está organizado para facilitar la adición de nuevos tipos de materiales y funcionalidades adicionales, como la gestión de usuarios y la generación de reportes.
