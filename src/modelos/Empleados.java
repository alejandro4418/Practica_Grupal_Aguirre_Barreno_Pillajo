package modelos;

public class Empleados {
    private String nombre;
    private int edad; // Tipo int
    private double salario;

    public Empleados(String nombre, String edadText, double salario) {
        if (nombre == null){
            throw new IllegalArgumentException("El nombre no puede estar vacio");
        }
        this.nombre = nombre;
        setEdad(edadText);
        setSalario(salario);
    }

    public void setEdad(String edadText) {
        if (edadText == null) {
            throw new IllegalArgumentException("La edad no puede ser nulo.");
        }
        this.edad = Integer.parseInt(edadText.trim());
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            throw new IllegalArgumentException("El salario no puede ser un valor negativo.");
        }
        this.salario = salario;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void mostrarDatos() {
        System.out.println("--- Datos del Empleado ---");
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Edad: " + this.getEdad() + " años");
        System.out.println("Salario: $" + this.getSalario());
    }

    public void forzarOverflowSalario(double multiplicadorGigante) {
        double salarioCalculado = this.salario * multiplicadorGigante;

        if (Double.isInfinite(salarioCalculado)) {
            throw new ArithmeticException("¡OVERFLOW DETECTADO! El salario calculado es demasiado grande para la memoria.");
        }
        this.salario = salarioCalculado;
    }



}
