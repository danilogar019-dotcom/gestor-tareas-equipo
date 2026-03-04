package gestortareasequipo;

import java.util.Scanner;

public class GestorTareasEquipo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        GestorTarea gestor = new GestorTarea();  // ← nombre correcto
        int opcion;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Añadir tarea");
            System.out.println("2. Ver tareas");
            System.out.println("0. Salir");
            System.out.print("Elige: ");

            opcion = teclado.nextInt();
            teclado.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Escribe la tarea: ");
                    String texto = teclado.nextLine();
                     << << << < HEAD
                    gestor.anadirTarea(texto);  // ← método correcto
                     == == ==
                            = gestor.añadirTarea(texto);  // ← método correcto
                     >>> >>> > feature - listado
                    break;

                case 2:
                    gestor.mostrarTareas();
                    break;

                case 0:
                    System.out.println("Adiós!");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        teclado.close();
    }
}
