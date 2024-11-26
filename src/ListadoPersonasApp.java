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
            try{
                salir = ejecutarOperacion(consola, personas);
            }catch (Exception e){
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
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
    private static boolean ejecutarOperacion(Scanner consola, List<Persona> personas){
        var opcion = Integer.parseInt(consola.nextLine());
        var salir = false;
        //Revisamos la opcion proporcionada
        switch (opcion) {
            case 1 ->{ //agregar persona a la lista
                agregarPersona(consola, personas);
                System.out.println("La lista tiene: " + personas.size() + " elementos.");
            }// fin de case 1
            case 2 ->
                listarPersonas(personas);
            //fin de case 2
            case 3 -> {
                //salimmos de nuestro ciclo
                System.out.println("Hasta pronto...");
                salir = true;
            }//fin de caso 3
            default -> System.out.println("Opcion Incorrecta: " + opcion);
        }//fin swicht
        return salir;

    }//fin de funcion ejecutarOperacion
    //función para agregar personas a la lista
    private static void agregarPersona(Scanner consola, List<Persona> personas){
        System.out.print("Proporciona el nombre: ");
        var nombre = consola.nextLine();
        System.out.print("Proporciona el teléfono: ");
        var tel = consola.nextLine();
        System.out.print("Proporciona el email: ");
        var email = consola.nextLine();
        //Crear el objeto Persona
        var persona = new Persona(nombre, tel, email);
        //lo agregamos a la lista
        personas.add(persona);
    }// fin de función agregarPersona
    //función listar personas
    private static void listarPersonas(List<Persona> personas){
        System.out.println("Listado de Personas: ");
        //Mejora usando lambda y metodo de referencia
        //personas.forEach((persona) -> System.out.println(persona));
        personas.forEach(System.out::println);
    }// fin de funcion listarPersonas
}
