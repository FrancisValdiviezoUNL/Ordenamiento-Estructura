package ed.u2.sorting;

public final class SelectionSort {

    public static void sort(int[] a, boolean trace) {

        int swaps = 0;

        for (int i = 0; i < a.length - 1; i++) {

            int[] before = a.clone();

            int min = i;

            // buscar mínimo
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }

            // si hay swap
            if (min != i) {
                int aux = a[i];
                a[i] = a[min];
                a[min] = aux;
                swaps++;

                if (trace)
                    System.out.println("Swap " + swaps + ": " + a[min] + " ↔ " + a[i]);
            }

            if (trace && !SortingUtils.arraysEqual(before, a)) {
                SortingUtils.printBarGraph(a);
            }
        }

        if (trace)
            System.out.println("Swaps totales: " + swaps);
    }



    public static void sort(int[] a) {
        sort(a, false);
    }
}
