package ed.u2.sorting.ordenamientos;

import java.util.Comparator;
import java.util.List;

public class SelectionSort {
    public static <T> void selectionSort(List<T> list, Comparator<T> comp, SortingMetrics m) {
        long start = System.nanoTime();

        for (int i = 0; i < list.size() - 1; i++) {
            int minIdx = i;

            for (int j = i + 1; j < list.size(); j++) {
                m.comparisons++;
                if (comp.compare(list.get(j), list.get(minIdx)) < 0) {
                    minIdx = j;
                }
            }

            if (minIdx != i) {
                T tmp = list.get(i);
                list.set(i, list.get(minIdx));
                list.set(minIdx, tmp);
                m.swaps++;
            }
        }

        m.timeNano = System.nanoTime() - start;
    }
}
