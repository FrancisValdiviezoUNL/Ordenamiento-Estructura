package ed.u2.sorting;

public final class SortingUtils {

    public static void printArray(int[] a) {
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
    public static boolean arraysEqual(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }




    public static void printBarGraph(int[] a) {

        int max = 0;
        for (int n : a) if (n > max) max = n;

        for (int nivel = max; nivel >= 1; nivel--) {
            for (int j = 0; j < a.length; j++) {
                if (a[j] >= nivel) System.out.print("  #  ");
                else System.out.print("     ");
            }
            System.out.println();
        }

        for (int j = 0; j < a.length; j++)
            System.out.print("-----");
        System.out.println();

        for (int j = 0; j < a.length; j++)
            System.out.printf("  %d  ", a[j]);

        System.out.println("\n");
    }
    public static void compareAll(int[] original) {

        System.out.println("\n=== COMPARACIÓN DE MÉTODOS ===");

        int[] ins = original.clone();
        int[] sel = original.clone();
        int[] bub = original.clone();

        long t1, t2;

        System.out.println("\n--- Inserción ---");
        t1 = System.nanoTime();
        InsertionSort.sort(ins, true);
        t2 = System.nanoTime();
        long tinser = t2 - t1;
        System.out.println("Resultado Inserción:");
        printBarGraph(ins);

        System.out.println("\n--- Selección ---");
        t1 = System.nanoTime();
        SelectionSort.sort(sel, true);
        t2 = System.nanoTime();
        long tsel = t2 - t1;
        System.out.println("Resultado Selección:");
        printBarGraph(sel);

        System.out.println("\n--- Burbuja ---");
        t1 = System.nanoTime();
        BubbleSort.sort(bub, true);
        t2 = System.nanoTime();
        long tbub = t2 - t1;
        System.out.println("Resultado Burbuja:");
        printBarGraph(bub);

        // TABLA FINAL
        System.out.println("====================================");
        System.out.println("         RESUMEN FINAL");
        System.out.println("====================================");

        System.out.printf("%-12s | %-12s | %s\n", "Método", "Tiempo (ms)", "Resultado");
        System.out.println("------------------------------------");
        System.out.printf("%-12s | %-12.4f | %s\n", "Inserción", tinser / 1_000_000.0, arrayToString(ins));
        System.out.printf("%-12s | %-12.4f | %s\n", "Selección", tsel / 1_000_000.0, arrayToString(sel));
        System.out.printf("%-12s | %-12.4f | %s\n", "Burbuja", tbub / 1_000_000.0, arrayToString(bub));
        System.out.println("------------------------------------");
    }

    public static String arrayToString(int[] a) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
            if (i < a.length - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }



}
