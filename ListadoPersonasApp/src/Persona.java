public class Persona {
    private int id;
    private String nombre;
    private String telefono;
    private String email;
    private static int numPersonas = 0; //Comparte el valor con todas las instancias

    //Constructor vacio
    public Persona(){
        this.id=++Persona.numPersonas;
    }
    //Constructor con argumentos
    public Persona(String nombre, String telefono, String email){
        this();//Se llama el constructor vacio
        this.nombre=nombre;
        this.telefono=telefono;
        this.email=email;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
