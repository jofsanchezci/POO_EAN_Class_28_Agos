
# Ejercicio: Implementación de Clases sobre Figuras Geométricas en Java

## Descripción del Problema

Se requiere desarrollar un programa en Java que modele varias figuras geométricas: el círculo, el rectángulo, el cuadrado y el triángulo rectángulo. Cada figura tendrá atributos específicos y métodos para calcular su área y su perímetro. Además, para el triángulo rectángulo se requiere implementar métodos adicionales para calcular la hipotenusa y determinar el tipo de triángulo (equilátero, isósceles, escaleno).

## Especificaciones

1. **Círculo**:
   - Atributo: `radio` en centímetros.
   - Métodos:
     - `calcularArea()`: Calcula el área del círculo.
     - `calcularPerimetro()`: Calcula el perímetro del círculo.

2. **Rectángulo**:
   - Atributos: `base` y `altura` en centímetros.
   - Métodos:
     - `calcularArea()`: Calcula el área del rectángulo.
     - `calcularPerimetro()`: Calcula el perímetro del rectángulo.

3. **Cuadrado**:
   - Atributo: `lado` en centímetros.
   - Métodos:
     - `calcularArea()`: Calcula el área del cuadrado.
     - `calcularPerimetro()`: Calcula el perímetro del cuadrado.

4. **Triángulo Rectángulo**:
   - Atributos: `base` y `altura` en centímetros.
   - Métodos:
     - `calcularArea()`: Calcula el área del triángulo.
     - `calcularPerimetro()`: Calcula el perímetro del triángulo.
     - `calcularHipotenusa()`: Calcula la hipotenusa del triángulo usando el teorema de Pitágoras.
     - `determinarTipo()`: Determina el tipo de triángulo según la longitud de sus lados (equilátero, isósceles o escaleno).

## Requisitos

1. Crear una clase base abstracta llamada `FiguraGeometrica` que defina los métodos abstractos `calcularArea()` y `calcularPerimetro()`.
2. Cada figura geométrica (Círculo, Rectángulo, Cuadrado, Triángulo Rectángulo) debe ser una subclase de `FiguraGeometrica` e implementar los métodos abstractos.
3. Crear una clase de prueba con un método `main` para crear instancias de las cuatro figuras y probar los métodos respectivos.

## Entrega

1. Implementación completa en Java de las clases descritas.
2. **Esquema del Diagrama de Clases UML** que represente la jerarquía de clases y sus relaciones.

---

Este ejercicio plantea un desafío completo que involucra la creación de una jerarquía de clases utilizando conceptos de Programación Orientada a Objetos (POO), como la herencia y el polimorfismo, y la implementación de métodos para cálculos geométricos específicos.
