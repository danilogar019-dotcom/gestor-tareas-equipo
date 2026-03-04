package gestortareasequipo;

import java.util.Scanner;

public class GestorTareasEquipo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        GestorTarea gestor = new GestorTarea();
        int opcion;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Añadir tarea");
            System.out.println("2. Ver tareas");
            System.out.println("0. Salir");
            System.out.print("Elige: ");

            opcion = teclado.nextInt();
            teclado.nextLine();

            if (opcion == 1) {
                System.out.print("Escribe la tarea: ");
                String texto = teclado.nextLine();
                gestor.añadirTarea(texto);
            }

            if (opcion == 2) {
                gestor.mostrarTareas();
            }

        } while (opcion != 0);

        System.out.println("Adios!");
    }
}
