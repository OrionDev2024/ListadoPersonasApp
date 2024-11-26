public class Persona {
    private int id;
    private String nombre;
    private String tel;
    private String email;
    private static int numeroPersonas = 0;

    //constructor vacío
    public Persona(){
        this.id = ++Persona.numeroPersonas;
    }
    //constructor con argumentos
    public Persona(String nombre, String tel, String email){
        this();//se llama el constructor vacío
        this.nombre = nombre;
        this.tel = tel;
        this.email = email;

    }
}
