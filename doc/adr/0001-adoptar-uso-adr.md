# 0001: Usar ADR para documentar decisiones técnicas y de arquitectura

* Estado: Aceptada
* Decisión: Moisés Mauricio López Vargas
* Fecha: 2024-11-14

## Contexto y Problema

En muchas ocasiones, la documentación de las decisiones técnicas y de arquitectura se desactualizan con el tiempo, al hacer uso de ADRs permitimos seguir una línea en el tiempo con todas las decisiones tomadas, documentando de manera clara el por qué se tomó la decisión así como las alternativas consideradas en su momento.

## Motivación

* Matener un repositorio único para referencia de las decisiones técnicas y de arquitectura tomadas.
* Visualizar através del tiempo como ha ido evolucionando nuestra arquitectura. 
* Mostrar los elementos que nos guiaron en la toma de decisiones.

## Alternativas consideradas

* Wiki Pages
* Google Docs

## Decisión

Adoptar el uso de **ADR** porque nos permite una forma clara de mostrar las diferentes opciones evaluadas, pros y contras, así como mantener de manera cercana la documentación de estas decisiones en nuestro código.

### Consecuencias positivas

* Mantener un punto de referencia claro y conciso de sobre lo que ha ocurrido en nuestra arquitectura a través del tiempo.
* Al ser posible versionar nuestros ADRs podemos ver la historia de las modificaciones sobre la documentación en ADRs en nuestro repositorio.

### Consecuencias negativas

* Se requerirá de tiempo adicional para la documentación y actualizazión de los ADR con cada decisión técnica o de Arquitectura tomada.

## Pros y Contras de las alternativas

### ADR

- **Pros**: Permite a nuevos desarrolladores que se unan al equipo tener una vista detallada de las decisiones a lo largo del proyecto.
- **Contras**:  Requiere de tiempo adicional para el análisis y la documentación de decisiones.

### Wiki Pages

- **Pros**: Provee una interfaz de usuario amigable para la edición de textos y permite darle formato al contenido.
- **Contras**: Usualmente la mayoría de Wiki pages quedan desactualizadas con el tiempo.

### Google Docs

- **Pros**: Es posible editar los documentos desde el navegador.
- **Contras**: Es más complicado el rastreo de cambios en el tiempo.