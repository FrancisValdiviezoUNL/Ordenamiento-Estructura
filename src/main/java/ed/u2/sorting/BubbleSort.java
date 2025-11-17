package ed.u2.sorting;

public final class BubbleSort {

    public static void sort(int[] a, boolean trace) {

        for (int i = 0; i < a.length - 1; i++) {

            int[] before = a.clone();

            int min = i;

            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }

            int aux = a[i];
            a[i] = a[min];
            a[min] = aux;

            if (trace && !SortingUtils.arraysEqual(before, a)) {
                System.out.println("\nPaso " + (i + 1) + ":");
                SortingUtils.printBarGraph(a);
            }
        }
    }


    public static void sort(int[] a) {
        sort(a, false);
    }
}
