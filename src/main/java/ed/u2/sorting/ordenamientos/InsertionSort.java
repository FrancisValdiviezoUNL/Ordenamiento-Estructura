package ed.u2.sorting.ordenamientos;

import java.util.Comparator;
import java.util.List;

public class InsertionSort {
    public static <T> void insertionSort(List<T> list, Comparator<T> comp, SortingMetrics m) {
        long start = System.nanoTime();

        for (int i = 1; i < list.size(); i++) {
            T key = list.get(i);
            int j = i - 1;

            while (j >= 0) {
                m.comparisons++;
                if (comp.compare(list.get(j), key) > 0) {
                    list.set(j + 1, list.get(j));
                    m.swaps++;
                    j--;
                } else {
                    break;
                }
            }
            list.set(j + 1, key);
        }

        m.timeNano = System.nanoTime() - start;
    }
}
