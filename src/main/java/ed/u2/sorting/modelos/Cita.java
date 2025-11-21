
package ed.u2.sorting.modelos;

import java.time.LocalDateTime;

public class Cita {
    public String id;
    public String apellido;
    public LocalDateTime fechaHora;

    public Cita(String id, String apellido, LocalDateTime fechaHora) {
        this.id = id;
        this.apellido = apellido;
        this.fechaHora = fechaHora;
    }

    @Override
    public String toString() {
        return id + ";" + apellido + ";" + fechaHora.toString();
    }
}
