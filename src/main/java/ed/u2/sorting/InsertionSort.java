package ed.u2.sorting;

public final class InsertionSort {

    public static void sort(int[] a, boolean trace) {

        for (int i = 1; i < a.length; i++) {

            int[] before = a.clone();
            int key = a[i];
            int j = i - 1;

            if (trace)
                System.out.println("\n--- Iteración " + i + " ---");

            while (j >= 0 && a[j] > key) {
                if (trace)
                    System.out.println("Moviendo " + a[j] + " de pos " + j + " → pos " + (j + 1));

                a[j + 1] = a[j];
                j--;
            }

            if (trace)
                System.out.println("Insertando " + key + " en pos " + (j + 1));

            a[j + 1] = key;

            if (trace && !SortingUtils.arraysEqual(before, a)) {
                SortingUtils.printBarGraph(a);
            }
        }
    }



    public static void sort(int[] a) {
        sort(a, false);
    }
}
