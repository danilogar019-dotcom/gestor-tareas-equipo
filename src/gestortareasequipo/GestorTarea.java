package gestortareasequipo;
import java.util.ArrayList;

public class GestorTarea {

    private ArrayList<Tarea> lista = new ArrayList<>();

    public void añadirTarea(String texto) {
        Tarea nueva = new Tarea(texto);
        lista.add(nueva);
        System.out.println("Tarea guardada.");
    }

    public void mostrarTareas() {
        if (lista.isEmpty()) {
            System.out.println("No hay tareas.");
        } else {
            for (int i = 0; i < lista.size(); i++) {
                System.out.println((i + 1) + ". " + lista.get(i).getDescripcion());
            }
        }
    }
}