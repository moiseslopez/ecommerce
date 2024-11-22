# 0003: Definir estructura de paquetes

* Estado: Aceptada
* Decisión: Moisés Mauricio López Vargas
* Fecha: 2024-11-19

## Contexto y Problema

Se ha decidido implementar el estilo arquitectónico de Onion Architecture en el proyecto de Ecommerce, por lo cual en el presente ADR se propone la estructura de paquetes del proyecto para que se garantice el cumplimiento de los principios de la arquitectura elegida.

## Motivación

* Garantizar que se cumplan los principios de la arquitectura Onion.
* Tener una base clara de nombrado y estructura de paquetes.

## Alternativas consideradas

* Separación por tipo de componente
* Separación por funcionalidad del sistema

## Decisión

Usar la siguiente estructura de paquetes:

```plaintext
└── com
    └── c7
        └── ecommerce
            ├── application         // Casos de Uso
            │   └── service         // Servicios de aplicación para orquestar lógica de negocio más compleja
            ├── domain              // Núcleo de entidades y lógica de negocio
            │   ├── entity          // Entidades de dominio
            │   ├── repository      // Interfaces de repositorios para consulta y guardado de la información
            │   └── service         // Servicios de dominio que contienen la lógica de negocio. Toda la lógica de negocio debe ser implementado como parte de servicios de dominio
            └── infrastructure      // Servicios de infraestructura, responsables de la comunicación con agentes externos
                ├── persistence     // Persistencia de la aplicación
                │   └── entity      // Entidades de persistencia
                │   └── repository  // Implementación de repositorios
                └── web             // Comunicación con el Frontend
                    └── controller  // Front controllers 
```

### Consecuencias positivas

* Separación clara entre capas del estilo arquitectónico Onion architecture
* Facilidad para garantizar los principios de la arquitectura.
* Código fácil de mantener.

### Consecuencias negativas

* Curva de aprendizaje para desarrolladores que no esten familiarizados con la arquitectura Onion y sus principios.

## Pros y Contras de las alternativas

### Separación por tipo de componente

- **Pros**: Permite la separación de manera más técnica al identificar componentes técnicos de nuestra aplicación y su tipo.
- **Contras**: Dificultad para identificar la manera en que se comunican las diferentes capas con los distintos componentes.


### Separación por funcionalidad del sistema

- **Pros**: Facilidad para identificar componentes con base en su funcionalidad
- **Contras**: Podría complicar el garantizar los principios de la arquitectura al no respetar la comunicación entre capas.