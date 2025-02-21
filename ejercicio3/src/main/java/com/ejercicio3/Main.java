// Taller de Programación en Java: Uso de Map y List con Entrada de Usuario
// 🚀 Ejercicio 3: Inventario de Productos con Map y List
package com.ejercicio3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Map<String, List<String>> inventario = new HashMap<>();

            // 1. Pedir al usuario la cantidad de categorías.
            System.out.print("Ingrese la cantidad de categorías: ");
            int cantidadCategorias = scanner.nextInt();
            scanner.nextLine();

            // 2. Para cada categoría, pedir productos y almacenarlos en un Map<String,
            // List<String>> .
            for (int i = 0; i < cantidadCategorias; i++) {
                System.out.print("Ingrese el nombre de la categoría " + (i + 1) + ": ");
                String categoria = scanner.nextLine();
                List<String> productos = new ArrayList<>();

                System.out.print("Ingrese la cantidad de productos en esta categoría: ");
                int cantidadProductos = scanner.nextInt();
                scanner.nextLine();

                for (int j = 0; j < cantidadProductos; j++) {
                    System.out.print("Ingrese el nombre del producto " + (j + 1) + ": ");

                    productos.add(scanner.nextLine());
                }
                inventario.put(categoria, productos);
            }

            // 3. Permitir mostrar todos los productos de una categoría específica.
            System.out.print("\nIngrese el nombre d ela categoría para ver sus productos: ");
            String categoriaBuscar = scanner.nextLine();
            if (inventario.containsKey(categoriaBuscar)){
                System.out.println("Productos en la categoría " + categoriaBuscar + ": " + inventario.get(categoriaBuscar));
            }else{
                System.out.println("Categoría no encontrada");
            }

            // 4. Permitir agregar un nuevo producto a una categoría existente.
            System.out.print("\nIngrese la categoría a la que desea agregar un producto: ");
            String categoriaAgregar = scanner.nextLine();
            if (inventario.containsKey(categoriaAgregar)){
                System.out.print("Ingrese el nombre del nuevo producto: ");
                String nuevoProducto = scanner.nextLine();

                inventario.get(categoriaAgregar).add(nuevoProducto);
                System.out.println("Producto agregado correctamente.");
            }else{
                System.out.println("Categoría no encontrada.");
            }

            // 5. Mostrar la lista completa de categorías y productos.
            System.out.println("\nInventario completo: ");
            for (Map.Entry<String, List<String>> entry : inventario.entrySet()){
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}