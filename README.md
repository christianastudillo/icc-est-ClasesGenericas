# Proyecto con Clases Genéricas en Java

Las clases genéricas permiten crear clases, interfaces y métodos que operan sobre tipos de datos que se especifican en el momento de la instancia o el uso de la clase. Esto permite mayor flexibilidad y reutilización de código.

## Definición de Clases Genéricas

Una clase genérica es una clase que tiene uno o más parámetros de tipo. Estos parámetros se pueden usar en el cuerpo de la clase para definir atributos y métodos de manera genérica, lo que permite utilizar la misma clase con distintos tipos de datos sin necesidad de duplicar código.

### Ejemplo de Clase Genérica: Producto

La clase `Producto<T>` es una clase genérica en la que `T` es un parámetro de tipo que se utiliza para el identificador del producto. Esto permite que el identificador (`id`) sea de cualquier tipo de dato, como un `Integer`, `String`, etc. La clase también contiene otros atributos, como `nombre` y `precio`, que son comunes a todos los productos.

#### Propiedades de la Clase Producto:

- `id`: Es un identificador de tipo genérico, lo que significa que puede ser cualquier tipo de dato. Por ejemplo, un `Integer` para productos numéricos o un `String` para productos con un código alfanumérico.
- `nombre`: El nombre del producto.
- `precio`: El precio del producto.

### Interpretación

Al utilizar la clase `Producto<T>`, podemos crear objetos de productos con diferentes tipos de identificadores sin tener que escribir varias clases para diferentes tipos de productos. Este es un ejemplo de la reutilización de código gracias a las clases genéricas.

En la clase `App`, hemos creado dos productos:

1. Un producto con `id` de tipo `Integer` (`producto1`).
2. Un producto con `id` de tipo `String` (`producto2`).

Ambos productos tienen el mismo diseño, pero con diferentes tipos de datos en sus identificadores, lo que muestra cómo las clases genéricas permiten mayor flexibilidad y eficiencia en la programación.


