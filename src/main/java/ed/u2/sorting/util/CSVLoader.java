
package ed.u2.sorting.util;

import java.nio.file.*;
import java.util.*;
import java.io.IOException;

public class CSVLoader {

    /**
     * Lee un CSV con separador ';' y devuelve una lista de arreglos de String
     * sin incluir la fila de encabezado.
     */
    public static List<String[]> load(String path) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(path));
        List<String[]> data = new ArrayList<>();

        if (lines.isEmpty()) {
            return data;
        }

        // saltar encabezado
        for (int i = 1; i < lines.size(); i++) {
            String line = lines.get(i).trim();
            if (line.isEmpty()) continue;
            data.add(line.split(";", -1));
        }
        return data;
    }
}
