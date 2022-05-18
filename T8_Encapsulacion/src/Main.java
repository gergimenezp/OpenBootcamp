public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona();
        persona1.setNombre("Juan Carlos");
        persona1.setEdad(34);
        persona1.setTelefono(647159753);

        Persona persona2 = new Persona();
        persona2.setNombre("Mabel");
        persona2.setEdad(45);
        persona2.setTelefono(647159842);

        System.out.println(persona1.getNombre() + ". Edad: " + persona1.getEdad() + ". Tel: " + persona1.getTelefono());
        System.out.println(persona2.getNombre() + ". Edad: " + persona2.getEdad() + ". Tel: " + persona2.getTelefono());

    }
}

class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }
}