
# Sistema de Gestión de Vehículos en Java

## Descripción del Proyecto

Este proyecto es una implementación básica de un sistema de gestión de vehículos utilizando conceptos de Programación Orientada a Objetos (POO) en Java. Incluye clases para diferentes tipos de vehículos, demostrando el uso de herencia, encapsulamiento, polimorfismo y abstracción.

## Estructura del Proyecto

El proyecto está organizado en la siguiente estructura de paquetes:

```
vehiculos/
├── src/
│   └── com/
│       └── ejemplo/
│           └── vehiculos/
│               ├── Vehiculo.java
│               ├── Coche.java
│               ├── Moto.java
│               ├── CocheDeportivo.java
│               ├── Conducible.java
│               └── SistemaGestionVehiculos.java
└── build/
```

### Clases y Funcionalidades

- **Vehiculo.java**: Clase abstracta que define los atributos y métodos comunes a todos los vehículos.
- **Coche.java**: Subclase de `Vehiculo` que añade el atributo `numeroPuertas` y sobrescribe el método `mostrarDetalles`.
- **Moto.java**: Subclase de `Vehiculo` que añade el atributo `tieneSidecar` y sobrescribe el método `mostrarDetalles`.
- **CocheDeportivo.java**: Subclase de `Coche` que añade el atributo `velocidadMaxima`, implementa la interfaz `Conducible` y sobrescribe el método `mostrarDetalles`.
- **Conducible.java**: Interfaz que define el método `conducir`.
- **SistemaGestionVehiculos.java**: Clase principal que contiene el método `main` para ejecutar el programa y probar las funcionalidades de las clases.

## Compilación y Ejecución

### Paso 1: Compilar el código

Desde el directorio raíz del proyecto (donde se encuentra la carpeta `src`), ejecuta el siguiente comando para compilar el código:

```bash
javac -d build src/com/ejemplo/vehiculos/*.java
```

Este comando compilará los archivos `.java` y generará los archivos `.class` correspondientes en la carpeta `build`, manteniendo la estructura del paquete.

### Paso 2: Ejecutar el programa

Una vez compilado, navega al directorio `build` y ejecuta el siguiente comando para ejecutar el programa principal:

```bash
java com.ejemplo.vehiculos.SistemaGestionVehiculos
```

## Funcionamiento del Programa

El programa creará instancias de diferentes tipos de vehículos (`Coche`, `Moto`, `CocheDeportivo`), mostrará sus detalles y simulará la conducción de un coche deportivo. Este ejemplo demuestra cómo se pueden utilizar los conceptos de POO en Java para organizar y estructurar el código de manera efectiva.

## Ejemplos de Uso

### 1. Crear un Coche y Mostrar sus Detalles

```java
Coche miCoche = new Coche("Toyota", "Corolla", 2020, 4);
miCoche.mostrarDetalles();
```

### 2. Crear una Moto con Sidecar y Mostrar sus Detalles
```java
Moto miMoto = new Moto("Harley-Davidson", "Iron 883", 2019, true);
miMoto.mostrarDetalles();
```
### 3. Crear un Coche Deportivo y Mostrar sus Detalles
```java
CocheDeportivo miCocheDeportivo = new CocheDeportivo("Ferrari", "488 GTB", 2022, 2, 330);
miCocheDeportivo.mostrarDetalles();
```

### Conducir un Coche Deportivo
```java
miCocheDeportivo.conducir();
```
