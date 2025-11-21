
package ed.u2.sorting.ordenamientos;

public class SortingMetrics {
    public long comparisons = 0;
    public long swaps = 0;
    public long timeNano = 0;

    public void reset() {
        comparisons = 0;
        swaps = 0;
        timeNano = 0;
    }
    public double getTimeMs() {
        return timeNano / 1_000_000.0;
    }


    @Override
    public String toString() {
        return "\n\tTiempo(ms)=" + getTimeMs() + "\n\tComparaciones=" + comparisons + "\n\tSwaps=" + swaps;
    }
}
