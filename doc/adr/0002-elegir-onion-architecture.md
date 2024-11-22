# 0002: Elegir Onion Architecture como estilo arquitectónico

* Estado: Aceptada
* Decisión: Moisés Mauricio López Vargas
* Fecha: 2024-11-1

## Contexto y Problema

El sistema requiere una estructura de código clara de manera que se garantice la protección de nuestra lógica de negocio de los detalles de implementación e infraestructura.

## Motivación

* Definir una estructura clara para nuestro código.
* Facilitar la mantenibilidad del código.
* Favorecer la testabilidad del código.

## Alternativas consideradas

* Arquitectura Limpia
* Arquitectura Hexagonal

## Decisión

Usar **Arquitectura de Cebolla** porque permite de manera clara y concisa la separación de capaz de la aplicación protegiendo al modelo de dominio de los detalles de implementación e infraestructura.

### Consecuencias positivas

* Protección de nuestro modelo de dominio de detalles de implementación e infraestructura.
* Facilidad de testing a la lógica de nuestro negocio.
* Código fácil de mantener.

### Consecuencias negativas

* Las capas pueden verse altamente acopladas si no se tiene cuidado en la separación de las mismas.

## Pros y Contras de las alternativas

### Arquitectura Limpia

- **Pros**: Permite la independencia de Frameworks, Bases de Datos y agentes externos en general.
- **Contras**: Al intentar independizar el sistema de todo, crea una inflexibilidad al momento de trabajar con ciertos Frameworks.

### Hexagonal

- **Pros**: Busca la independencia del sistema de detalles externos.
- **Contras**:  A pesar de que el sistema se conectará con servicios o proveedores externos, la cantidad de servicios externos que requerirá será muy pequeña para que valga la pena la implementación de puertos y adaptadores.
