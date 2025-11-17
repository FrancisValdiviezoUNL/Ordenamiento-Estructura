package ed.u2.sorting;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            while (true) {

                System.out.println("\n=== MENU DE ORDENAMIENTO ===");
                System.out.println("Ingrese números separados por espacio:");
                String linea = sc.nextLine();

                String[] partes = linea.trim().split(" ");

                if (linea.trim().isEmpty()) {
                    System.out.println("Debe ingresar al menos un número.\n");
                    continue;
                }

                int[] datos = new int[partes.length];
                for (int i = 0; i < partes.length; i++) {
                    datos[i] = Integer.parseInt(partes[i]);
                }

                System.out.println("\nSeleccione algoritmo:");
                System.out.println("1. Inserción");
                System.out.println("2. Selección");
                System.out.println("3. Burbuja");
                System.out.println("4. Comparacion 3 metodos");
                System.out.println("0. Salir");
                System.out.print("Opción: ");
                int op = Integer.parseInt(sc.nextLine());

                if (op == 0) {
                    System.out.println("Saliendo...");
                    break;
                }

                System.out.println("\n=== ESTADO INICIAL ===");
                SortingUtils.printBarGraph(datos);

                switch (op) {
                    case 1 -> InsertionSort.sort(datos, true);
                    case 2 -> SelectionSort.sort(datos, true);
                    case 3 -> BubbleSort.sort(datos, true);
                    case 4 -> {
                        SortingUtils.compareAll(datos);
                        continue;
                    }
                    default -> System.out.println("Opción inválida.");
                }

                System.out.println("=== RESULTADO FINAL ===");
                SortingUtils.printBarGraph(datos);
            }

            sc.close();
        }
}
