package ed.u2.sorting;
import ed.u2.sorting.datasets.DatasetLoader;
import ed.u2.sorting.modelos.Cita;
import ed.u2.sorting.modelos.Paciente;
import ed.u2.sorting.modelos.ProductoInventario;
import ed.u2.sorting.ordenamientos.*;

import java.util.*;

public class Main {

    public static void recomendacion(SortingMetrics burbuja, SortingMetrics seleccion, SortingMetrics insercion) {
        List<SortingMetrics> metodos = new LinkedList<>();
        metodos.add(burbuja);
        metodos.add(seleccion);
        metodos.add(insercion);

        String[] nombres = {"Burbuja", "Selección", "Inserción"};

// Encontrar el de menos swaps
        int indiceMenor = 0;
        SortingMetrics menor = metodos.get(0);

        for (int i = 1; i < metodos.size(); i++) {
            if (metodos.get(i).swaps < menor.swaps) {
                menor = metodos.get(i);
                indiceMenor = i;
            }
        }

        System.out.println("El algoritmo con menos swaps fue: "
                + nombres[indiceMenor] + " con " + menor.swaps + " swaps.");
    }

    private static void citas(String path) throws Exception {
        List<Cita> citas = DatasetLoader.cargarCitas(path);
        Comparator<Cita> porFecha = (a, b) -> a.fechaHora.compareTo(b.fechaHora);

        System.out.println("Dataset: " + path + " (n=" + citas.size() + ") - clave = fechaHora");

        List<Cita> Lista_metodo1 = new ArrayList<>(citas);
        List<Cita> Lista_metodo2 = new ArrayList<>(citas);
        List<Cita> Lista_metodo3 = new ArrayList<>(citas);

        SortingMetrics metodo_Bubble = new SortingMetrics();
        SortingMetrics metodo_Select = new SortingMetrics();
        SortingMetrics metodo_Insert = new SortingMetrics();

        BubbleSort.bubbleSort(Lista_metodo1, porFecha, metodo_Bubble);
        SelectionSort.selectionSort(Lista_metodo2, porFecha, metodo_Select);
        InsertionSort.insertionSort(Lista_metodo3, porFecha, metodo_Insert);


        System.out.println("------------------------------");
        System.out.println("Burbuja:    " + metodo_Bubble);
        System.out.println("------------------------------");
        System.out.println("Seleccion: " + metodo_Select);
        System.out.println("------------------------------");
        System.out.println("Insercion: " + metodo_Insert);
        System.out.println("------------------------------");

        recomendacion(metodo_Bubble, metodo_Select, metodo_Insert);
    }

    private static void pacientes(String path) throws Exception {
        List<Paciente> pacientes = DatasetLoader.cargarPacientes(path);
        Comparator<Paciente> porApellido = (a, b) -> a.apellido.compareTo(b.apellido);

        System.out.println("Dataset: " + path + " (n=" + pacientes.size() + ") - clave = apellido");

        List<Paciente> Lista_metodo1 = new ArrayList<>(pacientes);
        List<Paciente> Lista_metodo2 = new ArrayList<>(pacientes);
        List<Paciente> Lista_metodo3 = new ArrayList<>(pacientes);

        SortingMetrics metodo_Bubble = new SortingMetrics();
        SortingMetrics metodo_Select = new SortingMetrics();
        SortingMetrics metodo_Insert = new SortingMetrics();

        BubbleSort.bubbleSort(Lista_metodo1, porApellido, metodo_Bubble);
        SelectionSort.selectionSort(Lista_metodo2, porApellido, metodo_Select);
        InsertionSort.insertionSort(Lista_metodo3, porApellido, metodo_Insert);

        System.out.println("------------------------------");
        System.out.println("Burbuja:    " + metodo_Bubble);
        System.out.println("------------------------------");
        System.out.println("Seleccion: " + metodo_Select);
        System.out.println("------------------------------");
        System.out.println("Insercion: " + metodo_Insert);
        System.out.println("------------------------------");

        recomendacion(metodo_Bubble, metodo_Select, metodo_Insert);
    }

    private static void inventario(String path) throws Exception {
        List<ProductoInventario> inv = DatasetLoader.cargarInventario(path);
        Comparator<ProductoInventario> porStock = (a, b) -> Integer.compare(a.stock, b.stock);

        System.out.println("Dataset: " + path + " (n=" + inv.size() + ") - clave = stock");

        List<ProductoInventario> Lista_metodo1 = new ArrayList<>(inv);
        List<ProductoInventario> Lista_metodo2 = new ArrayList<>(inv);
        List<ProductoInventario> Lista_metodo3 = new ArrayList<>(inv);

        SortingMetrics metodo_Bubble = new SortingMetrics();
        SortingMetrics metodo_Select = new SortingMetrics();
        SortingMetrics metodo_Insert = new SortingMetrics();

        BubbleSort.bubbleSort(Lista_metodo1, porStock, metodo_Bubble);
        SelectionSort.selectionSort(Lista_metodo2, porStock, metodo_Select);
        InsertionSort.insertionSort(Lista_metodo3, porStock, metodo_Insert);

        System.out.println("------------------------------");
        System.out.println("Burbuja:    " + metodo_Bubble);
        System.out.println("------------------------------");
        System.out.println("Seleccion: " + metodo_Select);
        System.out.println("------------------------------");
        System.out.println("Insercion: " + metodo_Insert);
        System.out.println("------------------------------");

        recomendacion(metodo_Bubble, metodo_Select, metodo_Insert);
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("=== Taller Ordenación - Comparación Básica ===");
            System.out.println("1. Probar citas por fecha");
            System.out.println("2. Probar citas casi ordenadas por fecha");
            System.out.println("3. Probar pacientes por apellido");
            System.out.println("4. Probar inventario por stock");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            int op = -1;
            try {
                op = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opción inválida.");
                continue;
            }

            if (op == 5) {
                System.out.println("Saliendo...");
                break;
            }

            try {
                switch (op) {
                    case 1 -> citas("citas.csv");
                    case 2 -> citas("citas_casiOrdenadas.csv");
                    case 3 -> pacientes("pacientes.csv");
                    case 4 -> inventario("inventario_inverso.csv");
                    default -> System.out.println("Opción inválida.");
                }
            } catch (Exception e) {
                System.out.println("Error al procesar dataset: " + e.getMessage());
                e.printStackTrace();
            }

            System.out.println();
        }

        sc.close();
    }
}

