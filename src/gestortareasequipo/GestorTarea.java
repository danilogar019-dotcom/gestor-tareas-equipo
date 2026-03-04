package gestortareasequipo;

import java.util.ArrayList;

public class GestorTarea {

    private ArrayList<Tarea> lista = new ArrayList<>();

    /**
     * Añade una nueva tarea a la lista.
     *
     * @param texto Descripción de la tarea.
     */
    public void anadirTarea(String texto) {
        Tarea nueva = new Tarea(texto);
        lista.add(nueva);
        System.out.println("Tarea guardada.");
    }

    /**
     * Muestra todas las tareas almacenadas.
     */
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
