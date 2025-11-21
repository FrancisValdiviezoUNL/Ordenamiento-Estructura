package ed.u2.sorting.ordenamientos;

import java.util.Comparator;
import java.util.List;

public class BubbleSort {
    public static <T> void bubbleSort(List<T> list, Comparator<T> comp, SortingMetrics m) {
        long start = System.nanoTime();
        int n = list.size();
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                m.comparisons++;
                if (comp.compare(list.get(j), list.get(j + 1)) > 0) {
                    T tmp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, tmp);
                    m.swaps++;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

        m.timeNano = System.nanoTime() - start;
    }
}
