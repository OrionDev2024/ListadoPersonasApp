import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ListadoPersonasApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner((System.in));
        //Definimos la lista fuera del ciclo while
        List<Persona> personas = new ArrayList<>();
        //empezamos con el menu
        var salir = false;
        while (!salir){
            mostrarMenu();
            System.out.println();
        }
    }
    private static void mostrarMenu(){
        //Mostramos las opciones
        System.out.print("""
                *** Listado Personas App ***
                1. Agregar.
                2. Listar.
                3. Salir.
                """);
        System.out.print("Proporciona la opción: ");
    }
}
