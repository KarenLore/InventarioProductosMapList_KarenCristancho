# Inventario de Productos con Map y List

## Descripción
Este programa en Java permite gestionar un inventario de productos categorizados. Se utiliza `Map<String, List<String>>` para organizar productos en diferentes categorías, permitiendo agregar nuevos productos y consultar la información.

## Funcionalidades
- Permite registrar categorías y productos asociados.
- Muestra los productos de una categoría en específico.
- Permite agregar nuevos productos a una categoría existentes.
- Muestra el inventario completo con su categoría y producto.

## Tecnologías Utilizadas
- Java 17+
- Scanner para entrada de datos.
- `HashMap<String, List<String>>` para almacenar categorías y productos.
- `ArrayList<String>` para gestionar listas de productos.

## Instrucciones de Uso
1. Ejecuta el programa.
2. Ingresa la cantidad de categorías que desea registrar.
3. Para cada categoría, ingresa su nombre y la cantidad de productos que debe contener esa categoría.
4. Agrega los nombres de los productos.
5. Consulta los productos de una categoría ingresando su nombre.
6. Agrega nuevos productos a una categoría existente.
7. Visualiza el inventario completo.

## Ejemplo de Ejecución
```
Ingrese la cantidad de categorías: 2
Ingrese el nombre de la categoría 1: Frutas
Ingrese la cantidad de productos en esta categoría: 2
Ingrese el nombre del producto 1: Fresa
Ingrese el nombre del producto 2: Mango
Ingrese el nombre de la categoría 2: Verduras
Ingrese la cantidad de productos en esta categoría: 2
Ingrese el nombre del producto 1: Repollo
Ingrese el nombre del producto 2: Arveja

Ingrese el nombre de la categoría para ver sus productos: Frutas
Productos en la categoría Frutas: [Fresa, Mango]

Ingrese la categoría a la que desea agregar un producto: Verduras
Ingrese el nombre del nuevo producto: Brócoli
Producto agregado correctamente.

Inventario completo:
Frutas: [Fresa, Mango]
Verduras: [Repollo, Arveja, Brócoli]
```

## Autor
**Karen Cristancho**
