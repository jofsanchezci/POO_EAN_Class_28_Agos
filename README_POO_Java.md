
# Introducción a la Programación Orientada a Objetos (POO) en Java

## Conceptos Clave

### 1. Clases y Objetos
- **Clase**: Es una plantilla o un molde que define las propiedades (atributos) y comportamientos (métodos) de un tipo particular de objeto. Por ejemplo, si tienes una clase `Coche`, esta podría tener atributos como `marca`, `modelo`, y `color`, y métodos como `acelerar()` o `frenar()`.
- **Objeto**: Es una instancia de una clase. Es decir, cuando creas un objeto, estás creando una "cosa" específica que tiene todas las propiedades y comportamientos definidos por su clase. Por ejemplo, un objeto de la clase `Coche` podría ser un coche específico como un "Toyota Corolla rojo".

### 2. Encapsulamiento
- Este principio consiste en ocultar los detalles internos de un objeto y exponer solo lo necesario. Las propiedades de un objeto suelen ser privadas (es decir, no accesibles directamente desde fuera del objeto) y se accede a ellas mediante métodos públicos (como `getters` y `setters`).
- Ejemplo:
    ```java
    public class Coche {
        private String marca;
        private String modelo;
        
        public String getMarca() {
            return marca;
        }
        
        public void setMarca(String marca) {
            this.marca = marca;
        }
        
        public void acelerar() {
            System.out.println("El coche está acelerando");
        }
    }
    ```

### 3. Herencia
- La herencia permite crear nuevas clases a partir de clases existentes. La clase nueva, llamada **subclase** o **clase hija**, hereda los atributos y métodos de la clase base o **superclase**. Esto permite reutilizar y extender el código existente.
- Ejemplo:
    ```java
    public class CocheElectrico extends Coche {
        private int capacidadBateria;
        
        public void cargarBateria() {
            System.out.println("Cargando la batería");
        }
    }
    ```
- Aquí, `CocheElectrico` hereda de `Coche` y añade su propio atributo `capacidadBateria` y su método `cargarBateria()`.

### 4. Polimorfismo
- El polimorfismo permite que una clase hija o un objeto se comporte de manera diferente dependiendo del contexto. Específicamente, se refiere a la capacidad de los métodos de tener varias formas (por ejemplo, métodos con el mismo nombre en clases diferentes).
- Ejemplo:
    ```java
    Coche miCoche = new CocheElectrico();
    miCoche.acelerar(); // Aunque miCoche es un Coche, se comporta como un CocheElectrico
    ```
- Aquí, `acelerar()` podría comportarse de manera diferente si `CocheElectrico` ha sobrescrito ese método.

### 5. Abstracción
- La abstracción consiste en definir las características esenciales de un objeto, eliminando los detalles innecesarios. En Java, esto se puede lograr mediante clases abstractas e interfaces.
- Una **clase abstracta** es una clase que no puede ser instanciada directamente y puede tener métodos abstractos (sin implementación) que deben ser implementados por las subclases.
- Una **interfaz** es similar a una clase abstracta, pero solo puede contener métodos abstractos y constantes. Una clase puede implementar múltiples interfaces, lo que permite un alto grado de flexibilidad y modularidad.
- Ejemplo de interfaz:
    ```java
    public interface Vehiculo {
        void conducir();
    }
    
    public class Coche implements Vehiculo {
        public void conducir() {
            System.out.println("Conduciendo un coche");
        }
    }
    ```

## Anotaciones
Estos conceptos son la base de la POO en Java y permiten construir sistemas más organizados y fáciles de manejar. La combinación de encapsulamiento, herencia, polimorfismo y abstracción hace que la POO sea un enfoque poderoso para la programación, especialmente en proyectos grandes y complejos.
