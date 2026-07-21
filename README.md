# Tienda de Café

## Descripción del problema

En una tienda de café, los clientes pueden realizar pedidos personalizados seleccionando una bebida base y agregando distintos complementos, como leche, chocolate o canela.

El problema aparece cuando se intenta representar cada combinación posible mediante clases independientes. Esto produce una gran cantidad de clases, dificultad para mantener el código y poca flexibilidad para agregar nuevos ingredientes.

Por ejemplo, si existen varias bebidas base y múltiples complementos, las combinaciones posibles aumentan rápidamente. Crear una clase para cada combinación no es una solución escalable.

## Solución propuesta

Para resolver este problema se implementa el patrón de diseño Decorator.

Este patrón permite agregar funcionalidades o características adicionales a un objeto de manera dinámica, sin modificar su estructura original. En este proyecto, cada bebida base puede ser decorada con distintos ingredientes adicionales.

De esta manera, un pedido puede construirse combinando objetos:

- Café simple
- Café simple con leche
- Café simple con leche y chocolate
- Espresso con canela
- Entre otros

## Patrón aplicado

### Decorator

El patrón Decorator permite envolver un objeto dentro de otro objeto decorador que añade comportamiento adicional.

En este sistema:

- `Bebida` define la interfaz común.
- `CafeSimple` y `Espresso` son bebidas base.
- `BebidaDecorator` es una clase abstracta que contiene una referencia a una bebida.
- `Leche`, `Chocolate` y `Canela` son decoradores concretos que agregan descripción y costo.

## Beneficios

- Evita crear una clase por cada combinación de bebida.
- Permite agregar nuevos complementos fácilmente.
- Mantiene el código flexible y reutilizable.
- Cumple con el principio Open/Closed, ya que se pueden agregar decoradores sin modificar las bebidas existentes.