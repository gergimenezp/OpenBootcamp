public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Juan Carlos");
        cliente1.setEdad(34);
        cliente1.setTelefono(647159753);
        cliente1.setCredito(219.23);

        System.out.println("CLIENTE: " + cliente1.getNombre());
        System.out.println("Edad: " + cliente1.getEdad());
        System.out.println("Tel: " + cliente1.getTelefono());
        System.out.println("Credito disponible: " + cliente1.getCredito());

        Trabajador trabajador1 = new Trabajador();
        trabajador1.setNombre("Mabel");
        trabajador1.setEdad(45);
        trabajador1.setTelefono(647159842);
        trabajador1.setSalario(1499.13);

        System.out.println("TRABAJADOR: " + trabajador1.getNombre());
        System.out.println("Edad: " + trabajador1.getEdad());
        System.out.println("Tel: " + trabajador1.getTelefono());
        System.out.println("Salario mensual: " + trabajador1.getSalario());
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

class Cliente extends Persona{
    private double credito;

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public double getCredito() {
        return credito;
    }
}

class Trabajador extends Persona{
    private double salario;

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
}