
package ed.u2.sorting.datasets;


import ed.u2.sorting.modelos.Cita;
import ed.u2.sorting.modelos.Paciente;
import ed.u2.sorting.modelos.ProductoInventario;
import ed.u2.sorting.util.CSVLoader;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class DatasetLoader {

    public static List<Cita> cargarCitas(String path) throws IOException {
        List<String[]> rows = CSVLoader.load(path);
        List<Cita> result = new ArrayList<>();

        for (String[] r : rows) {
            if (r.length < 3) continue;
            String id = r[0];
            String apellido = r[1];
            LocalDateTime fecha = LocalDateTime.parse(r[2]);
            result.add(new Cita(id, apellido, fecha));
        }
        return result;
    }

    public static List<Paciente> cargarPacientes(String path) throws IOException {
        List<String[]> rows = CSVLoader.load(path);
        List<Paciente> result = new ArrayList<>();

        for (String[] r : rows) {
            if (r.length < 3) continue;
            String id = r[0];
            String apellido = r[1];
            int prioridad = Integer.parseInt(r[2]);
            result.add(new Paciente(id, apellido, prioridad));
        }
        return result;
    }

    public static List<ProductoInventario> cargarInventario(String path) throws IOException {
        List<String[]> rows = CSVLoader.load(path);
        List<ProductoInventario> result = new ArrayList<>();

        for (String[] r : rows) {
            if (r.length < 3) continue;
            String id = r[0];
            String insumo = r[1];
            int stock = Integer.parseInt(r[2]);
            result.add(new ProductoInventario(id, insumo, stock));
        }
        return result;
    }
}
